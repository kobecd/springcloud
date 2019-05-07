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


