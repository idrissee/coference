package com.example.demo.controllers;

import com.example.demo.Services.implementation.ConferenceService;
import com.example.demo.entites.Conference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conferences") // URL de base pour ce contrôleur
public class GestionDesConferences {

    @Autowired
    private ConferenceService conferenceService;

    // 1. Récupérer toutes les conférences
    @GetMapping
    public List<Conference> getAllConferences() {
        return conferenceService.getAllConferences();
    }

    // 2. Récupérer une conférence par ID
    @GetMapping("/{id}")
    public ResponseEntity<Conference> getConferenceById(@PathVariable int id) {
        return conferenceService.getConferenceById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
        
    }

    // 3. Créer une nouvelle conférence
    @PostMapping
    public ResponseEntity<Conference> createConference(@RequestBody Conference conference) {
        Conference savedConference = conferenceService.createConference(conference);
        return ResponseEntity.ok(savedConference);
    }

    // 4. Mettre à jour une conférence existante
    @PutMapping("/{id}")
    public ResponseEntity<Conference> updateConference(@PathVariable int id, @RequestBody Conference updatedConference) {
        return conferenceService.updateConference(id, updatedConference)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // 5. Supprimer une conférence
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConference(@PathVariable int id) {
        if (conferenceService.deleteConference(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
