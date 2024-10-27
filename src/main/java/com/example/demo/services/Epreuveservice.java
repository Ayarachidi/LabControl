package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Epreuve;

@Service
public interface Epreuveservice {
    
    List<Epreuve> getAllEpreuves();
    Epreuve saveEpreuve(Epreuve epreuve);
    Epreuve getEpreuveById(Long id);
    Long countEpreuves();
    void deleteEpreuveById(Long id);
    Epreuve editEpreuve(Epreuve epreuve);
    void archiveEpreuve(Long id);
}
