package org.example;


import java.util.Date;
import java.time.LocalDate;
abstract class Item {
    String id;
    String title;

    Date dueDate;
    abstract void displayDetails();

    public String getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

}
