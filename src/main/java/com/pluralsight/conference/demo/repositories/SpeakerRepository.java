package com.pluralsight.conference.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conference.demo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
