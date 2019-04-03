#最顶级父项目为ray




-----
新版本值得关注的亮点：

环境说明
---
1. 基于 Java 8
2. 数据库 MongoDB、Redis

特点
---
1. 响应式 Web 编程支持，即使用了模板来渲染页面，
2. 安全框架的支持 Spring Security
3. 支持 Quartz 调度程序










--------------
参考资料：

[Spring Boot 2.0 迁移指南](https://www.oschina.net/translate/spring-boot-2-0-migration-guide)
-----

spring 两种兼容关系
Spring Cloud	        Spring Boot
Finchley                	兼容Spring Boot 2.0.x，不兼容Spring Boot 1.5.x
Dalston和Edgware	兼容Spring Boot 1.5.x，不兼容Spring Boot 2.0.x
Camden	                兼容Spring Boot 1.4.x，也兼容Spring Boot 1.5.x
Brixton	                兼容Spring Boot 1.3.x，也兼容Spring Boot 1.4.x
Angel	                    兼容Spring Boot 1.2.x
只要按照上述表格做spring boot和spring cloud的关系匹配，就不会出现该报错了。
启动时的 ASCII 图像 Spring Boot banner 现已支持 GIF

