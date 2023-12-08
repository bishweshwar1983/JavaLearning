package org.example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;

public class Library {

    Date dueDate = new Date(1,1,1);
    private ArrayList<Item> availableItems = new ArrayList<>();
    private ArrayList<Item> borrowedItems = new ArrayList<>();

    private Map<Item, Date> borrowedItem = new HashMap<>();
    private ArrayList<Member> members = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

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
            borrowedItem.put(i1, new Date());
        }
   }


   public void returnItem(String memberId, String itemId){
       Item i1 = checkBorrowedItemId(itemId);
       Member m1 = checkMemberId(memberId);
       if (i1 == null || m1 == null){
           System.out.println("item or member not found");
       }
       else{
           Date borrowDate = borrowedItem.get(i1);
           if(borrowDate.after(dueDate)){
               System.out.println("Due date already passed for item " + i1 + m1);
           }
           m1.returnItem(i1);
           availableItems.add(i1);
           borrowedItems.remove(i1);
           borrowedItem.entrySet().removeIf(entry -> entry.getKey().equals(i1));
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

   public void displayBorrowedItemDueDate(){
        for(Item m: borrowedItem.keySet()){
            String key = m.toString();
            Date date = borrowedItem.get(m);
            System.out.println(key + "                  " + sdf.format(date));
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
