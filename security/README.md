#认证方式： 
基于多种媒介
内存用户认证、
数据库认证、
LDAP认证、
还可以自定义用户服务、
还可以自己定义认证


优势是什么：
Spring Security是一个能够为基于Spring的企业应用系统提供声明式的安全访问控制解决方案的安全框架。它提供了一组可以在Spring应用上下文中配置的Bean，充分利用了Spring IoC，DI（控制反转Inversion of Control ,DI:Dependency Injection 依赖注入）和AOP（面向切面编程）功能，为应用系统提供声明式的安全访问控制功能，减少了为企业系统安全控制编写大量重复代码的工作。

UsernamePasswordAuthenticationFilter

...

FilterSecurityInterceptor

处理异常引导用户登录
ExceptionTranslationFilter

【大门】没有登录的则抛出响应异常
FilterSecurityInterceptor


--------------------

简单限流
当系统处理能力有限的情况下，如何阻止计划外的请求对系统继续施压，这是一个需要重视的问题？
这里用到的是断尾求生思路，
除了限制流量，限流应用还能做用户行为控制，避免垃圾请求，单位时间内超过允许次数的请求视作非法请求，需要做相应的处理

#登陆
#限流
#update



在规定时间内只允许发生N次，

#####指定用户user_id的某个行为action_id在特定时间内允许发生的最多次数
def is_action_allowed(user_id,action_id,period,max_count)
return true;
#####调用接口判断一分钟内最多允许回复5个帖子
can_replay=is_action_allowed("test_man",""reply",60,5)
if can_reply:
    do_reply()
else:
    raise ActionThresholdOverflow()
    
zset数据结构的score值，通过score来圈出这个时间窗口来，
zset的value填什么比较合适呢？保证卫星行即可，毫秒时间戳？
zset记录用户行为历史记录，每一个行为都会作为zset中的一个key保存下来，同一个用户的行为用一个zset记录
优化：为了节省内存，我们只需要保存时间窗口内的行为记录，同时如果用户是冷用户，滑动时间窗口的行为记录是空的记录，那么可以删除这个zset,
通过统计滑动窗口内的行为数量与阈值maxCount进行比较久可以得出当前行为是否被允许

操作：
每一个行为来到时，都维护一次时间窗口，将时间窗口外的记录全部清除掉，只保留窗口内的记录，zset集合中只有score值是非常重要的，value没有什么特别的意义，只要保证他的唯一就可以了，
以为这几个连续的redis操作都是针对同一个key的，使用pipeline可以显著提高redis的存取效率，但这个方案也有缺点，以为他要记录时间窗口内所有的行为记录，如果这个流量很大，比如“60s内操作不得超过100w次”，它就不再适合这样的限流了，因为空间消耗巨大

高级限流做法--漏斗限流


一组过滤器，组成过滤器链

