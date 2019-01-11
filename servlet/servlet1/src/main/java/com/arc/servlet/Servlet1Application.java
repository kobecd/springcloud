package com.arc.servlet;

import com.arc.servlet.web.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Servlet1Application {

    public static void main(String[] args) {
        SpringApplication.run(Servlet1Application.class, args);
    }

    @Bean
    public ServletRegistrationBean MyServlet1(){
        return new ServletRegistrationBean(new MyServlet(),"/servlet/1");
    }
}

