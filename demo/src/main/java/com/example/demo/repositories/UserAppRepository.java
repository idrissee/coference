package com.example.demo.repositories;


import com.example.demo.entites.UserApp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository("userAppRepository")
public interface UserAppRepository extends CrudRepository<UserApp, Integer> {

   public UserApp findByEmail(String email);




}
