package com.example.projet.Service;

import com.example.projet.Entity.Etudiant;
import com.example.projet.Repository.IEtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService {

    @Autowired
    private IEtudiantRepository etudiantRepository; // Injection du repository

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantRepository.findAll(); // Récupérer tous les étudiants
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return (List<Etudiant>) etudiantRepository.saveAll(etudiants); // Ajouter une liste d'étudiants
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e); // Mettre à jour un étudiant existant
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null); // Récupérer un étudiant par ID
    }

    @Override
    public void removeEtudiant(long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant); // Supprimer un étudiant par ID
    }
}
