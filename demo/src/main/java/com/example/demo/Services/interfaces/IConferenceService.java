package com.example.demo.Services.interfaces;

import com.example.demo.entites.Conference;
import java.util.List;
import java.util.Optional;

public interface IConferenceService {
    List<Conference> getAllConferences();
    Optional<Conference> getConferenceById(int id);
    Conference createConference(Conference conference);
    Optional<Conference> updateConference(int id, Conference updatedConference);
    boolean deleteConference(int id);
}
