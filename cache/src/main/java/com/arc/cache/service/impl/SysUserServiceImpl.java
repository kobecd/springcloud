package com.arc.cache.service.impl;

import com.arc.cache.mapper.SysUserMapper;
import com.arc.cache.model.domain.SysUser;
import com.arc.cache.model.request.SysUserRequest;
import com.arc.cache.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 叶超
 * @since 2019/3/15 15:54
 */
@Slf4j
@Transactional
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;


//    @EnableCaching    启用缓存配置 在配置类上有效
//    @Cacheable 指定某个方法的返回值是可以缓存的。在注解属性中指定缓存规则。
//    @Cacheput 将方法的返回值缓存到指定的key中
//    @CacheEvict 删除指定的缓存数据
//    注意
//    @Cacheable和@Cacheput都会将方法的执行结果按指定的key放到缓存中，@Cacheable在执行时，会先检测缓存中是否有数据存在，如果有，直接从缓存中读取。如果没有，执行方法，将返回值放入缓存，而@Cacheput会先执行方法，然后再将执行结果写入缓存。总结使用@Cacheput的方法一定会执行，@Cacheable则判断有无缓存后分情况处理。

//    https://blog.csdn.net/dreamhai/article/details/80642010

//    缓存
//    Spring在缓存方法的返回值时是以键值对进行缓存的，值就是方法的返回结果，至于键的话，Spring又支持两种策略，默认策略和自定义策略，这个稍后会进行说明。需要注意的是当一个支持缓存的方法在对象内部被调用时是不会触发缓存功能的。@Cacheable可以指定三个属性，value（属性是必须指定）、key（可选）和condition（可选）。

    @Override
    public Long save(SysUser user) {
        return sysUserMapper.save(user) == 1 ? user.getId() : null;
    }

    //注意: allEntries属性
//      allEntries是boolean类型，表示是否需要清除缓存中的所有元素。默认为false，表示不需要。当指定了allEntries为true时，Spring Cache将忽略指定的key。有的时候我们需要Cache一下清除所有的元素，这比一个一个清除元素更有效率。
    @CacheEvict(value = "users", allEntries = true)
    @Override
    public int delete(Long id) {
        return sysUserMapper.delete(id);
    }


    // beforeInvocation属性
    //       清除操作默认是在对应方法成功执行之后触发的，即方法如果因为抛出异常而未能成功返回时也不会触发清除操作。使用beforeInvocation可以改变触发清除操作的时间，当我们指定该属性值为true时，Spring会在调用该方法之前清除缓存中的指定元素。
    //   @CacheEvict(value="users", beforeInvocation=true)
    //   public void delete(Integer id) {
    //      System.out.println("delete user by id: " + id);
    //   }
    //        其实除了使用@CacheEvict清除缓存元素外，当我们使用Ehcache作为实现时，我们也可以配置Ehcache自身的驱除策略，其是通过Ehcache的配置文件来指定的。由于Ehcache不是本文描述的重点，这里就不多赘述了，想了解更多关于Ehcache的信息，请查看我关于Ehcache的专栏。
//    @Caching
//       @Caching注解可以让我们在一个方法或者类上同时指定多个Spring Cache相关的注解。其拥有三个属性：cacheable、put和evict，分别用于指定@Cacheable、@CachePut和@CacheEvict。
//   @Caching(cacheable = @Cacheable("users"), evict = { @CacheEvict("cache2"),
//   @CacheEvict(value = "cache3", allEntries = true) })
//   public User find(Integer id) {
//      returnnull;
//

    //---------------------
    //@CachePut也可以标注在类上和方法上。使用@CachePut时我们可以指定的属性跟@Cacheable是一样的。
    @CachePut(value = "users", key = "#p0.id")//每次都会执行方法，并将结果存入指定的缓存中
    @Override
    public int update(SysUser user) {
        return sysUserMapper.update(user);
    }


    //Cache 可以指定多个，cache1和cache2上的
    //使用key属性自定义key，自定义策略是指我们可以通过Spring的EL表达式来指定我们的key。
    // 这里的EL表达式可以使用方法参数及它们对应的属性。使用方法参数时我们可以直接使用 “#参数名”或者 “#p参数index”。下面是几个使用参数作为key的示例。

    //1 表示key 是指传入时的参数
    @Cacheable(value = {"cache1", "cache2"}, key = "#id")
    @Override
    public SysUser get(Long id) {
        return sysUserMapper.get(id);
    }

    //2 表示第一个参数
    @Cacheable(value = "users", key = "#p0")
    @Override
    public SysUser testCacheKey1(SysUser user, Long id, String name) {
        log.debug("##########################");
        SysUser sysUser = sysUserMapper.get(user.getId());
        log.debug("##########################");
        return sysUser;
    }

    //3 表示User中的id值
    @Cacheable(value = "users", key = "#user.id")
    @Override
    public SysUser testCacheKey2(SysUser user, Long id, String name) {
        log.debug("##########################");
        SysUser sysUser = sysUserMapper.get(user.getId());
        log.debug("##########################");
        return sysUser;
    }

    //4 表示User中的id值
    @Cacheable(value = "users", key = "#p0.id")
    @Override
    public SysUser testCacheKey3(SysUser user, Long id, String name) {
        log.debug("##########################");
        SysUser sysUser = sysUserMapper.get(user.getId());
        log.debug("##########################");
        return sysUser;
    }

    //---------------------------------用默认的root--------------------------------------
    //1 当前方法名 #root.methodName
    @Cacheable(value = "users", key = "#root.methodName")
    @Override
    public SysUser testCacheKeyMethodName(SysUser user, Long id, String name) {
        log.debug("##########################");
        SysUser sysUser = sysUserMapper.get(user.getId());
        log.debug("##########################");
        return sysUser;
    }

    //这种不关心参数，值是关心该方法是否有调用与否
    //2 当前方法  #root.method.name
    @Cacheable(value = "users", key = "#root.method.name")
    @Override
    public SysUser testCacheKeyMethodName2(SysUser user, Long id, String name) {
        log.debug("##########################");
        SysUser sysUser = sysUserMapper.get(user.getId());
        log.debug("##########################");
        return sysUser;
    }


    //Cannot convert com.arc.cache.service.impl.SysUserServiceImpl to String. Register a Converter or override toString().
    //3 当前被调用的对象  #root.target
    @Cacheable(value = "users", key = "target")
    @Override
    public SysUser testCacheKeyTarget(SysUser user, Long id, String name) {
        log.debug("##########################");
        SysUser sysUser = sysUserMapper.get(user.getId());
        log.debug("##########################");
        return sysUser;
    }

    //4 当前被调用的对象的class    #root.targetClass
    @Cacheable(value = "users", key = "#root.targetClass")
    @Override
    public SysUser testCacheKeyTargetClass(SysUser user, Long id, String name) {
        log.debug("##########################");
        SysUser sysUser = sysUserMapper.get(user.getId());
        log.debug("##########################");
        return sysUser;
    }

    //5 当前方法参数组成的数组    #root.args[0]
    @Cacheable(value = "users", key = "#root.args[0]")
    @Override
    public SysUser testCacheKeyArgs(SysUser user, Long id, String name) {
        log.debug("##########################");
        SysUser sysUser = sysUserMapper.get(user.getId());
        log.debug("##########################");
        return sysUser;
    }

    //6	当前被调用的方法使用的Cache    #root.caches[0].name
    @Cacheable(value = "users", key = "#root.caches[0].name")
    @Override
    public SysUser testCacheKeyArgsName(SysUser user, Long id, String name) {
        log.debug("##########################");
        SysUser sysUser = sysUserMapper.get(user.getId());
        log.debug("##########################");
        return sysUser;
    }

    //-----------------------------------------
    // 根据条件判断是否缓存
    //有的时候我们可能并不希望缓存一个方法所有的返回结果。
    // 通过condition属性可以实现这一功能。
    // condition属性默认为空，表示将缓存所有的调用情形。其值是通过SpringEL表达式来指定的，
    // 当为true时表示进行缓存处理；当为false时表示不进行缓存处理，即每次调用该方法时该方法都会执行一次。
    // 如下示例表示只有当user的id为偶数时才会进行缓存
    @Cacheable(value = {"users"}, key = "#user.id", condition = "#user.id%2==0")
    @Override
    public SysUser testCondition(SysUser user) {
        System.out.println("find user by user " + user);
        log.debug("##########################");
        SysUser sysUser = sysUserMapper.get(user.getId());
        log.debug("##########################");
        return user;
    }


    @Override
    public List<SysUser> list() {
        return sysUserMapper.list();
    }


    /**
     * 特殊方法
     * t_sys_user_auth left join  t_sys_user
     *
     * @param identifier 身份标记
     * @return SysUSer with auth
     */
    @Override
    public SysUser getByIdentifierAndIdentityType(String identifier, Integer identityType) {
        //约定，在sql中完成嘛?? 登陆时候默认用第一种种类型校验 identityType=1，即username、password
        if (identityType == null) {
            identityType = 1;
        }
        SysUser user = sysUserMapper.getByIdentifierAndIdentityType(identifier, identityType);
        log.debug("结果={}", user);
        return user;
    }

    @Override
    public Boolean login(String username, String password) {
        Boolean result = false;
//        SysUser dbUser = getByUsername(username);
//        //@todo MD5或者其他加密手段
//        if (dbUser != null && dbUser.getPassword() != null && dbUser.getPassword().equals(password)) {
//            result = true;
//        }
        return result;
    }

    @Override
    public List<Object> listPage(SysUserRequest query) {
        return null;
    }
}
