package com.example.demo.entites;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
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
