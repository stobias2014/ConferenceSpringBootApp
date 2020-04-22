package com.tobias.saul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobias.saul.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long>{

}
