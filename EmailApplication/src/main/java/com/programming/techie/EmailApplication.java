package com.programming.techie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = {"com.programming.techie"})
public class EmailApplication {
    public static void main(String[] args){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        var context = SpringApplication.run(EmailApplication.class, args);
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        EmailClient emailClient = context.getBean(EmailClient.class);
//        System.out.println(Arrays.asList(applicationContext.getBeanDefinitionNames()));

//        EmailClient emailClient = new EmailClient(new BasicSpellChecker());
        emailClient.sendEmail("Hey, this is my first email");
        emailClient.sendEmail("Hey, this is my second email");

    }
}
