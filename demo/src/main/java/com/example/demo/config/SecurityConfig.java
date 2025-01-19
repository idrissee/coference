package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/h2-console/**").permitAll()  // Autoriser l'accès à la console H2
                        .requestMatchers("/api/conferences/**").permitAll()  // Autoriser l'accès aux API conférences
                        .requestMatchers("/api/conferences").permitAll()  // Autoriser l'accès à l'API conférences
                        .anyRequest().permitAll()  // Autoriser toutes les autres requêtes
                )
                .csrf(csrf -> csrf.disable())  // Désactiver CSRF pour simplifier les tests (à éviter en production)
                .headers(headers -> headers
                        .frameOptions(frameOptions -> frameOptions.sameOrigin())  // Permettre à la console H2 de s'afficher
                );

        return http.build();
    }
}
