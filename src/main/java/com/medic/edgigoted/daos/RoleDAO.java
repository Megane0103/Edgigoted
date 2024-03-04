package com.medic.edgigoted.daos;

import com.medic.edgigoted.entities.Role;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RoleDAO {
    Role findById(Long id);
    List<Role> findAll();
    void save(Role role);
    void update(Role role);
    void delete(Role role);
}

@Repository
public class RoleDAOImpl implements RoleDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public Role findById(Long id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public List<Role> findAll() {
        // Implementation to fetch all roles
    }

    @Override
    public void save(Role role) {
        entityManager.persist(role);
    }

    @Override
    public void update(Role role) {
        entityManager.merge(role);
    }

    @Override
    public void delete(Role role) {
        entityManager.remove(role);
    }
}
