package main;

import java.util.ArrayList;
import java.util.List;

public class BookRepo {

    private final List<Book> books;

    BookRepo() {
        books = new ArrayList<>(
                List.of(
                        new Book("HarryPotter 1", "HP1"),
                        new Book("HarryPotter 2", "HP2"),
                        new Book("HarryPotter 3", "HP3")
                )
        );

    }

    public List<Book> getAllBooks() {
        return this.books;
    }

    public void saveBook(Book book) {
        this.books.add(book);
    }
}
