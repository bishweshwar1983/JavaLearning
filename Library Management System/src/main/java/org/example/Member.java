package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Member {
    private String memberId;
    private String memberName;

    private ArrayList<Item> borrowedItems = new ArrayList<>();

    public Member(String memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public void borrowItem(Item item){
        borrowedItems.add(item);
        item.setDueDate(LocalDate.now().plusDays(7));
    }

    public void returnItem(Item item){
        borrowedItems.remove(item);
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void displayBorrowedItems(){
        if(borrowedItems.size() != 0){
            for(Item i : borrowedItems){
                System.out.println(memberId + "   " + memberName + "     " +  i + "      " + i.getDueDate() );
            }
        }
        else{
            System.out.println(memberId + "   " + memberName +  "      No itmes borrowed");
        }

    }

    @Override
    public String toString(){
        return memberId + "  " + memberName;
    }
}
