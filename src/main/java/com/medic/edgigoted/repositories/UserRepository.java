package com.medic.edgigoted.repositories;

import java.util.Optional;

import com.medic.edgigoted.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsernameOrEmail(String username, String email);
}