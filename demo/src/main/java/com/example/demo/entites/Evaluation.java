package com.example.demo.entites;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;


    public Evaluation(){}
    public Evaluation(String description) {
        this.description = description;
    }
}
