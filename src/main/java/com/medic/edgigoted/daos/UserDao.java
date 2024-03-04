package com.medic.edgigoted.daos;

import com.medic.edgigoted.entities.User;

import java.util.List;

public interface UserDao {
    User findById(Long id);
    List<User> findAll();
    void save(User user);
    void update(User user);
    void delete(User user);
}
