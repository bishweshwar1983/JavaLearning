package com.programming.techie;

public class AdvancedSpellChecker implements SpellChecker{

    public void checkSpelling(String emailMessage){
        if (emailMessage!= null){
            System.out.println("Spell Checking Completed.....");
        } else {
            throw new RuntimeException("An exception has occurred....");
        }
    }
}
