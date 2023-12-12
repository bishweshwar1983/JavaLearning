package com.programming.techie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailApplication {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);

//        EmailClient emailClient = new EmailClient(new AdvancedSpellChecker());
        emailClient.sendEmail("Hey, this is my first email");
        emailClient.sendEmail("Hey, this is my second email");

    }
}
