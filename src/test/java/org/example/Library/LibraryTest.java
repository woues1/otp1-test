package org.example.Library;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library = new Library();

    @Test
    void addBook() {
        library.addBook("programming 101");
        library.addBook("test");
        assertEquals(library.listBook().getFirst(), "programming 101");
        assertEquals(library.listBook().getLast(), "test");
    }

    @Test
    void removeBook() {
        library.addBook("programming 101");
        library.removeBook("programming 101");
        assertEquals(library.listBook().size(), 0);
    }

    @Test
    void listBook() {
        library.addBook("99999");
        assertEquals(library.listBook().getFirst(), "99999");
    }
}