package org.example;

public class Magazine extends Item{

    private String publisher;
    private String editionDate;

    public Magazine(String publisher, String editionDate, String id, String title){
        this.publisher = publisher;
        this.editionDate = editionDate;
        this.id = id;
        this.title = title;
    }

    public void displayDetails(){
        System.out.println("Publisher: " + getPublisher() + "   " + "Edition Date: " + getEditionDate());
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }

    @Override
    public String toString() {
        return publisher + "  " + editionDate;
    }
}

