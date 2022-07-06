package bookstore.myApp.Entity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;

@Entity
public class BookEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "Book_title")
    private String title;

    @Column(name = "Author")
    private String author;

    @Column(name = "Description")
    private String description;

    @Column(name = "Price")
    private BigDecimal price;

    @Column(name = "Year_of_publication")
    private int publicationYear;

    public BookEntity() {}

    public long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public BookEntity setBookTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor(){
        return author;
    }
    public BookEntity setBookAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getDescription() {
        return description;
    }
    public BookEntity setBookDesc(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public BookEntity setBookPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public long getPublicationYear() {
        return publicationYear;
    }

    public BookEntity setBookPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
        return this;
    }

    /*    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", title ='" + title + '\'' +
                ", author =" + author + '\'' +
                ", description =" + description + '\'' +
                ", price =" + price + '\'' +
                ", year of publication =" + publicationYear +
                '}';
    }*/
}
