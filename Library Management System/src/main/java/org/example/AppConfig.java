package org.example;

import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AppConfig {

    @Bean
    public Library Library(){
        Library lib = new Library();
        lib.registerMembers(member());
        lib.addItem(books());
        lib.addItem(mags());
        return lib;
    }

    @Bean
    public ArrayList<Member> member(){
        ArrayList<Member> members = new ArrayList<>();
        Member mem1 = new Member("1", "mem1");
        Member mem2 = new Member("2", "mem2");
        members.add(mem1);
        members.add(mem2);
        return members;
    }

    @Bean
    public ArrayList<Item> books(){
        return new ArrayList<>(Arrays.asList(new Book("Author1", 100, "B1", "Btitle1"), new Book("Author2", 200, "B2", "Btitle2")));
    }

    @Bean
    public ArrayList<Item> mags(){
        return new ArrayList<>(Arrays.asList(new Magazine("Publisher1", "1900", "M1", "Mtitle1"), new Magazine("Publisher2", "2000", "M2", "Mtitle2")));
    }
//
//    @Bean
//    public Magazine magazine(){
//        Magazine m = new Magazine();
//        m.setPublisher("Collins");
//        m.setEditionDate("1990");
//        return m;
//
//    }
}
