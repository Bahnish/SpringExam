package com.example.exambaha.repositories;

import com.example.exambaha.entities.Projet;
import com.example.exambaha.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ProjetRepository extends JpaRepository<Projet,Integer> {
    List<Projet> findAllBySprintsStartdateGreaterThan(LocalDate date);
    List<Projet> findAllByUserRoleAndUserFnameAndUserLname(Role r, String name, String lname);
}
