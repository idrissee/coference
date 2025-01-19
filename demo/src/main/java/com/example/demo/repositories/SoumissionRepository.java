package com.example.demo.repositories;

import com.example.demo.entites.Soumission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("soumissionRepository")
public interface SoumissionRepository extends CrudRepository<Soumission, Integer>{
}


