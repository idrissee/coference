package com.example.demo.entites;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;


@Data
@Entity
@NoArgsConstructor
public class Auteur {  // Refers to 'Auteur'

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;

    public Auteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "auteur")
    private Collection<Soumission> soumission;


}
