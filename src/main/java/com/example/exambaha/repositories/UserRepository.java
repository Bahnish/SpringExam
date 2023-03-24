package com.example.exambaha.repositories;

import com.example.exambaha.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;

public interface UserRepository extends JpaRepository<User,Integer> {
}
