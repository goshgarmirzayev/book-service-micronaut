package com.goshgarmirzayev.model;

import javax.persistence.*;

@Entity
@Table(name = "book_table", schema = "data")
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "author_name")
    private String authorName;
    @Column(name = "price")
    private float price;

    public Book() {

    }

    public Book(Integer id, String name, String authorName, float price) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
