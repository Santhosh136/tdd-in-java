package main;

import java.util.List;

public class BookService {

    private final BookRepo bookRepo;

    BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAllBooks() {
        return bookRepo.getAllBooks();
    }

    public void saveBook(Book book) {
        bookRepo.saveBook(book);
    }
}
