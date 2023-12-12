package com.programming.techie;

public class BasicSpellChecker implements SpellChecker{
    public void checkSpelling(String emailMessage){
        if(emailMessage != null){
            System.out.println("Checking spelling.....using BasicSpell");
            System.out.println("Spell Checking completed.....");
        } else {
            throw new RuntimeException("An Exception has occurred....");
        }
    }
}
