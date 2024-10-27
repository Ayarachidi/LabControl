package com.example.demo.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Analyse;
import com.example.demo.repositories.Analyserepository;
import com.example.demo.services.Analyseservice;

@Service
public class Analyseserviceimpl implements Analyseservice {
    
    @Autowired
    private Analyserepository analyseRepository;

    public Analyseserviceimpl(Analyserepository analyseRepository) {
        super();
        this.analyseRepository = analyseRepository;
    }

    @Override
    public List<Analyse> getAllAnalyses() {
        return analyseRepository.findAll();
    }

    @Override
    public Analyse saveAnalyse(Analyse analyse) {
        return analyseRepository.save(analyse);
    }

    @Override
    public Analyse getAnalyseById(Long id) {
        return analyseRepository.findById(id).orElse(null);
    }

    @Override
    public Analyse editAnalyse(Analyse analyse) {
        return analyseRepository.save(analyse);
    }

    @Override
    public Long countAnalyses() {
        return analyseRepository.count();
    }

    @Override
    public void deleteAnalyseById(Long id) {
        analyseRepository.deleteById(id);
    }


    @Override
    public void archiveAnalyse(Long id) {
    }
}