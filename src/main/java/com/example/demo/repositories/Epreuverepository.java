package com.example.demo.repositories;

import com.example.demo.entities.Epreuve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource
public interface Epreuverepository extends JpaRepository<Epreuve, Long> {
    
    
}
