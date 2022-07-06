package bookstore.myApp.Repository;

import bookstore.myApp.Entity.AuthorEntity;
import bookstore.myApp.Entity.BookEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<AuthorEntity, Integer> {

    @Query("select a.name, b.title from  AuthorEntity a left join BookEntity b on a.name = b.author")
    List<String> joinSting();

    @Query("select a from AuthorEntity a join BookEntity b on a.name = b.author")
    List<AuthorEntity> joinAuthor();

}
