package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;

public class Library {

    private ArrayList<Item> availableItems = new ArrayList<>();
    private ArrayList<Item> borrowedItems = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addItem(ArrayList<Item> items){
        this.availableItems.addAll(items);
    }

    public void registerMembers(ArrayList<Member> members){
        this.members.addAll(members);
    }

    public Item checkItemId(String itemId){
        for (Item i: availableItems){
            if (itemId.equals(i.getId())){
                return i;
            }
        }
        return null;
    }

    public Item checkBorrowedItemId(String itemId){
        for (Item i: borrowedItems){
            if (itemId.equals(i.getId())){
                return i;
            }
        }
        return null;
    }

    public Member checkMemberId(String memberId){
        for (Member m: members){
            if (memberId.equals(m.getMemberId())){
                return m;
            }
        }
        return null;
    }

    public void borrowItem(String memberId, String itemId){
        Item i1 = checkItemId(itemId);
        Member m1 = checkMemberId(memberId);

        if (i1 == null || m1 == null){
            System.out.println("item or member not found");
        }
        {
            m1.borrowItem(i1);
            availableItems.remove(i1);
            borrowedItems.add(i1);
        }
   }


   public void returnItem(String memberId, String itemId){
       Item i1 = checkBorrowedItemId(itemId);
       Member m1 = checkMemberId(memberId);
       if (i1 == null || m1 == null){
           System.out.println("item or member not found");
       }
       else{
           if (i1.getDueDate().isBefore(LocalDate.now().plusDays(10))){
               System.out.println("Due date has not passed");
           }
           m1.returnItem(i1);
           availableItems.add(i1);
           borrowedItems.remove(i1);
       }
   }

   public void displayAvailableItems(){
        for (Item i: availableItems){
            i.displayDetails();
        }

   }

   public void displayBorrowedItems(){
        for(Member m: this.members){
            m.displayBorrowedItems();
        }
   }

   public void displayMembers(){
       for(Member m: members){
           System.out.println(m);
       }
   }

    public void displayItems(){
        for(Item m: availableItems){
                    System.out.println(m.getClass().getSimpleName() + "   ===>   " + m);
        }
    }

    public void search(String title){
        for(Item i: availableItems){
            if (i.getTitle().equals(title)){
                System.out.println("ITEM FOUND:  " + i);
                return;
            }
        }
        System.out.println("Item not found");
    }
}
