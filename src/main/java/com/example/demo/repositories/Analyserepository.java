package com.example.demo.repositories;

import com.example.demo.entities.Analyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface Analyserepository extends JpaRepository<Analyse, Long> {
    
   
}
