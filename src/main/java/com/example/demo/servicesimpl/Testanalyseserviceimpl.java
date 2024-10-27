package com.example.demo.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.TestAnalyse;
import com.example.demo.repositories.Testanalyserepository;
import com.example.demo.services.Testanalyseservice;

@Service
public class Testanalyseserviceimpl implements Testanalyseservice {
    
    @Autowired
    private Testanalyserepository testAnalyseRepository;

    public Testanalyseserviceimpl(Testanalyserepository testAnalyseRepository) {
        super();
        this.testAnalyseRepository = testAnalyseRepository;
    }

    @Override
    public List<TestAnalyse> getAllTestAnalyses() {
        return testAnalyseRepository.findAll();
    }

    @Override
    public TestAnalyse saveTestAnalyse(TestAnalyse testAnalyse) {
        return testAnalyseRepository.save(testAnalyse);
    }

    @Override
    public TestAnalyse getTestAnalyseById(Long id) {
                 
        return testAnalyseRepository.findById(id).orElse(null);
    }

    @Override
    public TestAnalyse editTestAnalyse(TestAnalyse testAnalyse) {
        return testAnalyseRepository.save(testAnalyse);
    }

    @Override
    public Long countTestAnalyses() {
        return testAnalyseRepository.count();
    }

    @Override
    public void deleteTestAnalyseById(Long id) {
        // Vérifie si l'entité existe avant de la supprimer
        if (testAnalyseRepository.existsById(id)) {
            testAnalyseRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Le TestAnalyse avec l'id " + id + " n'existe pas.");
        }
    }

    @Override
    public void archiveTestAnalyse(Long id) {
        
    }
}
