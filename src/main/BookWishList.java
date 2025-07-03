package main;

import java.util.List;

public class BookWishList {

    // Client -> Controller -> Service -> Repo -> DB
    public static void main(String[] args) {

        BookRepo bookRepo = new BookRepo();
        BookService bookService = new BookService(bookRepo);
        BookController bookController = new BookController(bookService);

        bookController.createBook(new Book("Harry Potter 4", "HP4"));

        List<Book> books = bookController.getAllBooks();
        System.out.println(books);
    }
}
