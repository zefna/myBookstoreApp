package bookstore.myApp;

import bookstore.myApp.Entity.BookEntity;
import bookstore.myApp.Services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/bookstore")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
            this.bookService = bookService;
        }

        @GetMapping(value = "/{personId:\\d+}")
        public Optional<BookEntity> getBook(@PathVariable int id) {
            return bookService.getById(id);
        }
}
