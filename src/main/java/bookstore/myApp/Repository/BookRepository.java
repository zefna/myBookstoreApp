package bookstore.myApp.Repository;

import bookstore.myApp.Entity.BookEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<BookEntity, Integer> {

    @Query("select b.title, a.name from  BookEntity b left join AuthorEntity a on b.author = a.name")
    List<String> joinSting();

    @Query("select b from BookEntity b join AuthorEntity a on b.author = a.name")
    List<BookEntity> joinBook();

}
