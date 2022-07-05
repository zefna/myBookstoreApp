package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String title;

    private String author;

    private String description;

    private BigDecimal price;

    private long publicationYear;

    protected Book() {}

    public Book(String title,
                String author,
                String description,
                BigDecimal price,
                long publicationYear) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.publicationYear = publicationYear;
    }
}
