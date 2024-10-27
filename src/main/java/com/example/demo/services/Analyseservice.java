package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Analyse;

@Service
public interface Analyseservice {
    
    List<Analyse> getAllAnalyses();
    Analyse saveAnalyse(Analyse analyse);
    Analyse getAnalyseById(Long id);
    Long countAnalyses();
    void deleteAnalyseById(Long id);
    Analyse editAnalyse(Analyse analyse);
    void archiveAnalyse(Long id);
}
