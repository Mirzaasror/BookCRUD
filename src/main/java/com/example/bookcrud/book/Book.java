package com.example.bookcrud.book;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class Book {
    private int id;
    private String name;
    private String author;
    private double price;
//    private String email;
    private String janr;
//    private String password;
    private String image;

}
