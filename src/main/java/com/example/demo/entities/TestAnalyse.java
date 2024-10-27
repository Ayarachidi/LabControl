package com.example.demo.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class TestAnalyse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fkIdAnalyse")
    private Analyse analyse;

    private String nomTest;
    private String sousEpreuve;
    private Double intervalMinDeReference;
    private Double intervalMaxDeReference;
    private String uniteDeReference;
    private String details;

    private boolean archive; // Nouvel attribut

    @OneToMany(mappedBy = "testAnalyse", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Examen> examens; // Liste d'examens associés

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Analyse getAnalyse() {
        return analyse;
    }

    public void setAnalyse(Analyse analyse) {
        this.analyse = analyse;
    }

    public String getNomTest() {
        return nomTest;
    }

    public void setNomTest(String nomTest) {
        this.nomTest = nomTest;
    }

    public String getSousEpreuve() {
        return sousEpreuve;
    }

    public void setSousEpreuve(String sousEpreuve) {
        this.sousEpreuve = sousEpreuve;
    }

    public Double getIntervalMinDeReference() {
        return intervalMinDeReference;
    }

    public void setIntervalMinDeReference(Double intervalMinDeReference) {
        this.intervalMinDeReference = intervalMinDeReference;
    }

    public Double getIntervalMaxDeReference() {
        return intervalMaxDeReference;
    }

    public void setIntervalMaxDeReference(Double intervalMaxDeReference) {
        this.intervalMaxDeReference = intervalMaxDeReference;
    }

    public String getUniteDeReference() {
        return uniteDeReference;
    }

    public void setUniteDeReference(String uniteDeReference) {
        this.uniteDeReference = uniteDeReference;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isArchive() { // Getter pour l'attribut archive
        return archive;
    }

    public void setArchive(boolean archive) { // Setter pour l'attribut archive
        this.archive = archive;
    }

    public List<Examen> getExamens() { // Getter pour la liste d'examens
        return examens;
    }

    public void setExamens(List<Examen> examens) { // Setter pour la liste d'examens
        this.examens = examens;
    }
}
