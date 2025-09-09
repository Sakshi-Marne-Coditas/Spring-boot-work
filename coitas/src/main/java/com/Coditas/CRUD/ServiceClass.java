package com.Coditas.CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ServiceClass {
        RepositoryClass repositoryClass;

        @Autowired
    public ServiceClass(RepositoryClass repositoryClass) {
        this.repositoryClass = repositoryClass;
    }

    public EntityClass insertData(@RequestBody EntityClass entityClass) {
        return repositoryClass.save(entityClass);
    }

    public List<EntityClass> getAllEmployees() {
            return repositoryClass.findAll();
    }

    public String deletebyEmployee(int employeeId) {
             repositoryClass.deleteById(employeeId);
        return "Deleted successfully!";
    }
}
