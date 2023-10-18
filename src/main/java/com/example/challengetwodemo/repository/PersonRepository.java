package com.example.challengetwodemo.repository;

import com.example.challengetwodemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
