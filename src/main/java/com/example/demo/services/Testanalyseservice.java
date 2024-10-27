package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.TestAnalyse;

@Service
public interface Testanalyseservice {
    List<TestAnalyse> getAllTestAnalyses();
    TestAnalyse saveTestAnalyse(TestAnalyse testAnalyse);
    TestAnalyse getTestAnalyseById(Long id);
    Long countTestAnalyses();
    void deleteTestAnalyseById(Long id);
    TestAnalyse editTestAnalyse(TestAnalyse testAnalyse);
    void archiveTestAnalyse(Long id);
}
