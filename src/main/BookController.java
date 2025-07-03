package main;

import java.util.List;

public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    public void createBook(Book book) {
        bookService.saveBook(book);
    }
}
