package com.tobias.saul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobias.saul.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long>{

}
