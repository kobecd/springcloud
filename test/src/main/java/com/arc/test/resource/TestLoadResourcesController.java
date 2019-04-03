package com.arc.test.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * 测试文件读取
 *
 * @author 叶超
 * @since 2019/3/15 15:54
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestLoadResourcesController {


    @RequestMapping("/get/v1")
    public Object get1() {
        //读取 resources中的配置文件
        return loadConfigProperties("redis.properties");
    }

    //读取 resources中的配置文件
    private static String loadConfigProperties(String path) {
        //读取 resources中的配置文件
        InputStream stream = TestLoadResourcesController.class.getClassLoader().getResourceAsStream(path);
        Properties props = new Properties();
        try {
            props.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 通过key获取value
        String host = props.getProperty("redis.host");
        String port = props.getProperty("redis.port");
        String password = props.getProperty("redis.password");
        String database = props.getProperty("redis.database");
        String redisPoolTimeout = props.getProperty("redis.pool.timeout");

        StringBuffer sb = new StringBuffer();
        sb.append(host).append(port).append(password).append(database).append(redisPoolTimeout);
        System.out.println(sb.toString());
        return sb.toString();
    }


    public static void main(String[] args) throws IOException {
//        loadConfigProperties("redis.properties");

        loadConfigPropertiesFormJar("/redis.properties");
    }


    //读取 jar中的配置文件
    private static void loadConfigPropertiesFormJar(String path) throws IOException {
        //返回读取指定资源的输入流

        //jar文件本质是一个zip格式的压缩文件，只是把文件后缀名改了，要用Java读取里面的文件也没有那么想象的那么困难。使用相关协议就可以： 如果想不依赖绝对路径，那就先获取运行jar时候的当前绝对路径，然后加上要读的目录
        String jarPath = TestLoadResourcesController.class.getProtectionDomain().getCodeSource().getLocation().getFile();
        System.out.println(jarPath);
        URL url = new URL("jar:file:" + jarPath + "/test.jar!/test.properties");
//        URL url = new URL("jar:file:/C:/Users/X/Desktop/repeat.jar!/testconfig.properties");
        System.out.println(url);
        InputStream is = url.openStream();
        byte b[] = new byte[1000];
        is.read(b);
        System.out.println(new String(b).trim());
    }

    public void getResource() {
        //查找指定资源的URL，其中res.txt仍然开始的bin目录下
        URL fileURL = this.getClass().getResource("/resource/res.txt");
        System.out.println(fileURL.getFile());

    }
}


//----------------------下面是测试中有问题的方法

/**
 * 方案一：我们往常进行文件的加载的时候 用到的都是  FileInputStream进行 文件的加载比如下面一个例子 ：
 * <p>
 *  InputStream in=FileInputStream("1.properties"); 
 * Properties p=new Properties() ;
 * p.load(in)  ;//加载输入流 获得键值对
 * p.getProperties(...) ;////
 * <p>
 * 方案二：
 * 文件位置：
 * 某个绝对路径下              写绝对路径即可
 * 在本项目的classpath下  写文件名称即可
 * 在本项目的某个依赖jar的classpath下 写相对路径
 * <p>
 * 原文如下：
 * 我们要使用 类加载器 首先就要获得ClassLoader对象 ,然后通过ClassLoader的getResourceAsStream获得输入流
 * 1、因为我们这里是获得了类加载器然后通过类加载器来加载文件,但是类加载器并不知道配置文件是放在哪个目录下的 ,所以我们要将完整的路径名填上
 * InputStream in=主类名.class.getClassLoader().getResourceAsStream("me/test/1.txt");  //1.txt就在 classpath下
 * <p>
 * 2、指定某个类来加载,因为1.txt就在classpath下,并且这个类知道他自己的路径所以不需要相对路径,直接写文件名即可 。
 * IputStream in=ReflectTest2.class.getResourceAsStream("1.txt") ;  //1.txt就在 classpath下
 * <p>
 * 3、如果 1.txt 在classpath下 那么就直接写文件名就行了 ,但是 这个配置文件现在在另一个包中  ,所以我们要相对于根目录   。当然 这还可以改成"../config/cnfig.properties"
 * .表示当前目录  ..表示上级目录     
 * InputStream in=ReflectTest2.class.getResourceAsStream("/config/config.properties") ;  //1.txt在 config包中
 *
 * @param path
 * @return
 */
//    private static String loadConfigPropertiesFormJar(String path) {
////testconfig.properties
//        ClassLoader classLoader = TestLoadResourcesController.class.getClassLoader();
//
//        InputStream stream = classLoader.getResourceAsStream(path);
//
//        return null;
//    }

//ClassLoader
//      当运行一个程序是，JVM启动，bootstrap ClassLoader 加载java的核心API（ExtClassLoader跟AppClassLoader也在此时被加载），然后调用ExtClassLoader加载扩展API，最后AppClassLoader加载用户的自定义类。这就是一个程序最基本的加载流程。
//
//                ClassLoader在加载类时，使用了双亲委托模式，下面对这种模式进行简单阐述。
//
//                每一个自定义的ClassLoader都必须继承ClassLoader这个抽象类，而每个ClassLoader都会由一个父类ClassLoader，我们可以看以下ClassLoader这个抽象类中由一个getParent()方法，注意，这个parent不是指的被继承的类，而是在实例化该ClassLoader时指定的一个ClassLoader，如果这个parent为null，那么就默认该ClassLoader的parent是bootstrapclassloader，这个parent有什么用呢？
//
//                我们可以考虑这种情况，假设我们自定义了一个ClassLoader，我们使用它去加载String类，那么这里的String是否会被我们自定义的ClassLoader加载呢？事实上并不会，而是由bootstrapclassloader进行加载，为什么会这样？实际上这就是双亲委托模式的原因，因为任何一个自定义的bootstrapclassloader在对类进行加载前，都会委托它的parenClassLoader进行加载，只有当parenClassLoade无法加载时，才会由自己加载。上面讲过，ClassLoade的parent为null时，ClassLoader的parent就是bootstrapclassloader，因此最终委托到bootstrapclassloader时，就是返回String的Class。
//---------------------
//作者：戴明智
//来源：CSDN
//原文：https://blog.csdn.net/qq_41907991/article/details/79832585
//版权声明：本文为博主原创文章，转载请附上博文链接！
