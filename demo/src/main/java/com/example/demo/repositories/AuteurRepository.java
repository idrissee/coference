package com.example.demo.repositories;



import org.springframework.data.repository.CrudRepository;
import com.example.demo.entites.Auteur;
import org.springframework.stereotype.Repository;


@Repository("auteurRepository")
public interface AuteurRepository extends CrudRepository<Auteur, Integer> {

}

