package com.example.exambaha.repositories;

import com.example.exambaha.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProjetRepository extends JpaRepository<Projet,Integer> {
    List<Projet> findBySprintListstatDate(Date startDate);
}
