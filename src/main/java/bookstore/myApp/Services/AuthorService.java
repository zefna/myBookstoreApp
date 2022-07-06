package bookstore.myApp.Services;

import bookstore.myApp.Entity.AuthorEntity;
import bookstore.myApp.Entity.BookEntity;
import bookstore.myApp.Repository.AuthorRepository;

import java.util.List;
import java.util.Optional;

public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {

        this.authorRepository = authorRepository;

    }

    public void save(AuthorEntity authorEntity){
        authorRepository.save(authorEntity);
    }

    //возвращает лист всех сущностей из базы
    public List<AuthorEntity> getAll(){
            return (List<AuthorEntity>) authorRepository.findAll();
    }

    public Optional<AuthorEntity> getById(Integer id){
        return authorRepository.findById(id);
    }

    public void delById(Integer id){
        authorRepository.deleteById(id);
    }

    public List<String> joinString(){
        return authorRepository.joinSting();
    }

    public List<AuthorEntity> joinFruit(){
        return authorRepository.joinAuthor();
    }
}
