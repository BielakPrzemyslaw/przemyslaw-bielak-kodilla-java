package com.kodilla.spring.library;


import org.springframework.stereotype.Repository;

@Repository
public final class LibraryDbController {
    public void saveData() {
        System.out.println("Sawing data to the database");
    }

    public void  ladaData() {
        System.out.println("Loading data from database");
    }
}
