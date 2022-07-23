package com.pluralsight.conference.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conference.demo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
