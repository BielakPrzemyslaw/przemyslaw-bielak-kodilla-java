package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("My collect");
        Book book1 = new Book("Narretum", "Sapkowksi A.", LocalDate.of(2015, Month.OCTOBER, 12));
        Book book2 = new Book("Boży bojownicy", "Sapkowksi A.", LocalDate.of(2016, Month.DECEMBER, 1));
        Book book3 = new Book("Lux perprtua", "Sapkowksi A.", LocalDate.of(2018, Month.SEPTEMBER, 8));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My collection - copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("my Library - deep copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.removeBook(book2);

        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }

}
