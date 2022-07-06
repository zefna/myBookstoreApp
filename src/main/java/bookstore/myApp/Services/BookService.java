package bookstore.myApp.Services;

import bookstore.myApp.Entity.BookEntity;
import bookstore.myApp.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;

    }

    public void save(BookEntity bookEntity){
        bookRepository.save(bookEntity);
    }

    public List<BookEntity> getAll(){
        return (List<BookEntity>) bookRepository.findAll();
    }

    public Optional<BookEntity> getById(Integer id){
        return bookRepository.findById(id);
    }

    public void delById(Integer id){
        bookRepository.deleteById(id);
    }

    public List<String> joinString(){
        return bookRepository.joinSting();
    }

    public List<BookEntity> joinFruit(){
        return bookRepository.joinBook();
    }
}
