package com.example.demo.entites;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Entity
public class Soumission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String description;


    public Soumission() {}

    @ManyToOne
    private Auteur auteur;


    @OneToOne(cascade = CascadeType.ALL)
    private DetailsSoumission detailsSoumission;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conferance;

    public Soumission(String nom, String desc, Auteur auteur) {
        super();
        this.nom = nom;
        this.description = desc;
        this.auteur = auteur;
    }

    public void setDetailsSoumission(DetailsSoumission detailsSoumission) {
        this.detailsSoumission = detailsSoumission;
    }
}
