package com.programming.techie;

public class EmailClient {
    private SpellChecker spellChecker;

    EmailClient(SpellChecker spellChecker){
        this.spellChecker = spellChecker;
    }

    void sendEmail(String emailMessage){
        spellChecker.checkSpelling(emailMessage);
    }
}
