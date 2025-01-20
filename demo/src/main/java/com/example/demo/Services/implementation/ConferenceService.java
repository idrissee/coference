package com.example.demo.Services.implementation;

import com.example.demo.Services.interfaces.IConferenceService;
import com.example.demo.entites.Auteur;
import com.example.demo.entites.Conference;
import com.example.demo.repositories.ConferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ConferenceService implements IConferenceService {

    @Autowired
    private ConferenceRepository conferenceRepository;

    @Override
    public List<Conference> getAllConferences() {
        return (List<Conference>) conferenceRepository.findAll();
    }

    @Override
    public Optional<Conference> getConferenceById(int id) {
        return conferenceRepository.findById(id);
    }

    @Override
    public Conference createConference(Conference conference) {
        return conferenceRepository.save(conference);
    }

    @Override
    public Optional<Conference> updateConference(int id, Conference updatedConference) {

        return conferenceRepository.findById(id).map(existingConference -> {
            existingConference.setTitre(updatedConference.getTitre());
            existingConference.setDateDebut(updatedConference.getDateDebut());
            existingConference.setDateFin(updatedConference.getDateFin());
            existingConference.setThematique(updatedConference.getThematique());
            existingConference.setEtat(updatedConference.getEtat());
            return conferenceRepository.save(existingConference);
        });
    }

    @Override
    public boolean deleteConference(int id) {
        if (conferenceRepository.existsById(id)) {
            conferenceRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
