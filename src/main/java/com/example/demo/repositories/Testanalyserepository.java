package com.example.demo.repositories;

import com.example.demo.entities.TestAnalyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource
public interface Testanalyserepository extends JpaRepository<TestAnalyse, Long> {
    
    
}
