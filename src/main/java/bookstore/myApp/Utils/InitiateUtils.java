package bookstore.myApp.Utils;

import bookstore.myApp.Entity.AuthorEntity;
import bookstore.myApp.Entity.BookEntity;
import bookstore.myApp.Services.AuthorService;
import bookstore.myApp.Services.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class InitiateUtils implements CommandLineRunner {

    private final BookService bookService;
    private final AuthorService authorService;

    public InitiateUtils(BookService bookService,
                         AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @Override
    public void run(String... args) throws Exception {

        BookEntity bookEntity1 = new BookEntity();
        bookEntity1.setBookTitle("Harry Potter and the Philosopher's Stone");
        bookEntity1.setBookAuthor("J. K. Rowling");
        bookEntity1.setBookDesc("Harry Potter, a young wizard who discovers his magical heritage on his eleventh birthday, when he receives a letter of acceptance to Hogwarts School of Witchcraft and Wizardry.");
        bookEntity1.setBookPrice(new BigDecimal(700));
        bookEntity1.setBookPublicationYear(1997);

        BookEntity bookEntity2 = new BookEntity();
        bookEntity2.setBookTitle("Harry Potter and the Chamber of Secrets");
        bookEntity2.setBookAuthor("J. K. Rowling");
        bookEntity2.setBookDesc("Harry's second year at Hogwarts School of Witchcraft and Wizardry.");
        bookEntity2.setBookPrice(new BigDecimal(730));
        bookEntity2.setBookPublicationYear(1998);

        BookEntity bookEntity3 = new BookEntity();
        bookEntity3.setBookTitle("Ulysses");
        bookEntity3.setBookAuthor("James Joyce");
        bookEntity3.setBookDesc("Ulysses chronicles the appointments and encounters of the itinerant Leopold Bloom in Dublin in the course of an ordinary day, 16 June 1904.");
        bookEntity3.setBookPrice(new BigDecimal(2000));
        bookEntity3.setBookPublicationYear(1922);

        AuthorEntity authorEntity1 = new AuthorEntity();
        authorEntity1.setName("J. K. Rowling");

        AuthorEntity authorEntity2 = new AuthorEntity();
        authorEntity2.setName("James Joyce");

        bookService.save(bookEntity1);
        bookService.save(bookEntity2);
        bookService.save(bookEntity3);

        authorService.save(authorEntity1);
        authorService.save(authorEntity2);

        List<BookEntity> allBooks = bookService.getAll();
        List<AuthorEntity> allAuthors = authorService.getAll();

    }
}
