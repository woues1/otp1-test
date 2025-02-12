package org.example.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<String> books = new ArrayList<>();

    public void addBook(String book){
        books.add(book);
        System.out.println("Added: " + book);
    }
    public void removeBook(String book){
        books.remove(book);
        System.out.println("Removed: " + book);
    }
    public ArrayList<String> listBook(){
        for(String book : books){
            System.out.println(book);
        }
        return books;
    }
}
