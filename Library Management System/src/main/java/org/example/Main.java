package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Library lib = (Library) context.getBean("Library");
        System.out.println("------------------------------------------------Total Members in library----------------------------------------------------");
        lib.displayMembers();
        System.out.println("------------------------------------------------Total Items in library----------------------------------------------------");
        lib.displayItems();
        lib.borrowItem("1", "M1" );
        System.out.println("\n" + "-------------------------------------------------- After Borrow --------------------------------------------------------" + "\n");
        System.out.println("\n" + "Available items in library   ----> " + "\n");
        lib.displayAvailableItems();


        System.out.println("\n" + "Members and their borrowed itmes and due date----> " + "\n");
        lib.displayBorrowedItems();

        System.out.println("\n" + "-------------------------------------------------- After Return --------------------------------------------------------" + "\n");
        lib.returnItem("1", "M1");
        System.out.println("\n" + "Available items in library   =====> " + "\n");
        lib.displayAvailableItems();
        System.out.println("\n" + "Members and their borrowed itmes ====> " + "\n");
        lib.displayBorrowedItems();
        System.out.println("\n" + "-------------------------------------------------- Search Item --------------------------------------------------------" + "\n");
        lib.search("Btitle2");



        // How to implement borrowed items using only member bean

//        ArrayList<Member> member = (ArrayList<Member>) context.getBean("member");
//        for(Member m: member){
//            System.out.println(m);
//            m.displayBorrowedItems();
//        }



    }
}