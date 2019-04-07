package com.arc.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ConditionalOnClass({ MimeMessage.class, MimeType.class })
//@ConditionalOnMissingBean(MailSender.class)
//@Conditional(MailSenderCondition.class)
@EnableConfigurationProperties(MailProperties.class)

@SpringBootApplication
public class MailApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class, args);
    }


//    @Bean
//    public JavaMailSenderImpl mailSender() {
//        JavaMailSenderImpl sender = new JavaMailSenderImpl();
//        if (this.session != null) {
//            sender.setSession(this.session);
//        }
//        else {
//            applyProperties(sender);
//        }
//        return sender;
//}
}
