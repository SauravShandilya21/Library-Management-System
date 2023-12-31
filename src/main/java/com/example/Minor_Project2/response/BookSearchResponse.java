package com.example.Minor_Project2.response;


import com.example.Minor_Project2.models.Author;
import com.example.Minor_Project2.models.Genre;
import com.example.Minor_Project2.models.Student;
import com.example.Minor_Project2.models.Transaction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookSearchResponse {

    private int id;
    private String name;
    private int cost;

    private Genre genre;

    @JsonIgnoreProperties({"bookList", "addedOn"})
    private Author author;
    private Student student;

    private List<Transaction> transactionList;
    private Date createdOn;
    private Date updatedOn;



}
