package com.programming.techie;

public class EmailApplication {
    public static void main(String[] args){
        EmailClient emailClient = new EmailClient(new BasicSpellChecker());
        emailClient.sendEmail("Hey, this is my first email");

    }
}
