package com.example.demo.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Analyse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fkIdLaboratoire")
    private Laboratoire laboratoire;

    private String nom;
    private String description;

    @OneToMany(mappedBy = "analyse", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Epreuve> epreuves;

    @OneToMany(mappedBy = "analyse", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TestAnalyse> testAnalyses;

    private boolean archive; // Nouvel attribut

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Laboratoire getLaboratoire() {
        return laboratoire;
    }

    public void setLaboratoire(Laboratoire laboratoire) {
        this.laboratoire = laboratoire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Epreuve> getEpreuves() {
        return epreuves;
    }

    public void setEpreuves(List<Epreuve> epreuves) {
        this.epreuves = epreuves;
    }

    public List<TestAnalyse> getTestAnalyses() {
        return testAnalyses;
    }

    public void setTestAnalyses(List<TestAnalyse> testAnalyses) {
        this.testAnalyses = testAnalyses;
    }

    public boolean isArchive() { // Getter pour l'attribut archive
        return archive;
    }

    public void setArchive(boolean archive) { // Setter pour l'attribut archive
        this.archive = archive;
    }
}
