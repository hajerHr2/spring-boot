package com.example.projet.Service;

import com.example.projet.Entity.Universite;
import com.example.projet.Repository.IUniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversiteService implements IUniversiteService {

    @Autowired
    private IUniversiteRepository universiteRepository; // Injection du repository

    @Override
    public List<Universite> retrieveAllUniversities() {
        return (List<Universite>) universiteRepository.findAll(); // Récupérer toutes les universités
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u); // Ajouter une nouvelle université
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u); // Mettre à jour une université existante
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null); // Récupérer une université par ID
    }


}
