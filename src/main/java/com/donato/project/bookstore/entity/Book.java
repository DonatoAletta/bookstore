package com.donato.project.bookstore.entity;

import com.donato.project.bookstore.enumerator.BookGenreEnumerator;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "book")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(name = "title")
    private String title;

    @Setter
    @Column(name = "book_genre")
    private BookGenreEnumerator bookGenre;

    @Setter
    @Column(name = "price")
    private float price;

    @Setter
    @Column(name = "in_stock")
    private int inStock;

}
