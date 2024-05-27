package com.programming.techie;

import org.springframework.stereotype.Component;

@Component
public class dvancedSpellChecker implements SpellChecker{

    public void checkSpelling(String emailMessage){
        if (emailMessage!= null){
            System.out.println("Spell Checking Completed....using Advanced.");
        } else {
            throw new RuntimeException("An exception has occurred....");
        }
    }
}
