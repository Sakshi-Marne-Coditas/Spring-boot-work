package com.Coditas.CRUD;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface RepositoryClass extends JpaRepository<EntityClass, Integer> {

}
