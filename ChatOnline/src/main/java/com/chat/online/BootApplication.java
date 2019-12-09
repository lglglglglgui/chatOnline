package com.chat.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootApplication extends SpringBootServletInitializer {
    //启动springboot
    public static void main(String[] args) {
        SpringApplication springApplication=new SpringApplication(BootApplication.class);
        springApplication.run(args);
    }

}
