package org.example;


import java.util.Date;
import java.time.LocalDate;
abstract class Item {
    String id;
    String title;
    LocalDate dueDate;

    abstract void displayDetails();

    public String getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}
