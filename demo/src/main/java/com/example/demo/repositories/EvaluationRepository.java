package com.example.demo.repositories;




import com.example.demo.entites.Evaluation;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


@Repository("evaluationRepository")
public interface EvaluationRepository  extends CrudRepository<Evaluation, Integer>{
}
