package com.example.demo.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;


@Getter
@Setter
@Entity
public class UserApp {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(unique = true)
        private String email;
        private String password;

        public UserApp(String email, String password) {
                this.email = email;
                this.password = password;
        }

        public UserApp() {}
}
