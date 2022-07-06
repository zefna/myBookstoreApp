package bookstore.myApp.Entity;

import javax.persistence.*;

@Entity
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name = "Author_name")
    private String name;

    public AuthorEntity() {}

    public String getName() {
        return name;
    }

    public AuthorEntity setName(String name){
        this.name = name;
        return this;
    }
}
