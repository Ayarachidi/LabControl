package com.example.demo.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Epreuve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fkIdAnalyse")
    private Analyse analyse;

    private String nom;

    @OneToMany(mappedBy = "epreuve", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Examen> examens; // Liste d'examens associés à l'épreuve

    private boolean archive; // Attribut pour indiquer si l'épreuve est archivée

    // Getters et Setters

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Examen> getExamens() { // Getter pour la liste d'examens
        return examens;
    }

    public void setExamens(List<Examen> examens) { // Setter pour la liste d'examens
        this.examens = examens;
    }

    public boolean isArchive() { // Getter pour l'attribut archive
        return archive;
    }

    public void setArchive(boolean archive) { // Setter pour l'attribut archive
        this.archive = archive;
    }
}
