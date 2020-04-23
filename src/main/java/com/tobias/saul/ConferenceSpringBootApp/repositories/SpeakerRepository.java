package com.tobias.saul.ConferenceSpringBootApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tobias.saul.ConferenceSpringBootApp.models.Speaker;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long>{

}
