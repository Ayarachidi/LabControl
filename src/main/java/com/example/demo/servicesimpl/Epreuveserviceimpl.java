package com.example.demo.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Epreuve;
import com.example.demo.repositories.Epreuverepository;
import com.example.demo.services.Epreuveservice;

@Service
public class Epreuveserviceimpl implements Epreuveservice {
    
    @Autowired
    private Epreuverepository epreuveRepository;

    public Epreuveserviceimpl(Epreuverepository epreuveRepository) {
        super();
        this.epreuveRepository = epreuveRepository;
    }

    @Override
    public List<Epreuve> getAllEpreuves() {
        return epreuveRepository.findAll();
    }

    @Override
    public Epreuve saveEpreuve(Epreuve epreuve) {
        return epreuveRepository.save(epreuve);
    }

    @Override
    public Epreuve getEpreuveById(Long id) {
        return epreuveRepository.findById(id).orElse(null);
    }

    @Override
    public Epreuve editEpreuve(Epreuve epreuve) {
        return epreuveRepository.save(epreuve);
    }

    @Override
    public Long countEpreuves() {
        return epreuveRepository.count();
    }

    @Override
    public void deleteEpreuveById(Long id) {
        epreuveRepository.deleteById(id);
    }

 

    @Override
    public void archiveEpreuve(Long id) {
        
    }
}
