package org.example;

public class Book extends Item{

    private String author;
    private int numberOfPages;

    public Book(String author, int numberOfPages, String id, String title){
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.id = id;
        this.title = title;
    }
    public void displayDetails(){
        System.out.println("Author: " + getAuthor() + "     "+ "No. Of Pages: " + String.valueOf(getNumberOfPages()));
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString(){return  "ID: " + id + "     " + "Author: " + author + "     " + "Title: " + title  + "     " + "No. Of pages: "  + numberOfPages ;}
}
