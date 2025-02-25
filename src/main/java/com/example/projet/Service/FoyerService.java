package com.example.projet.Service;

import com.example.projet.Entity.Foyer;
import com.example.projet.Repository.IFoyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoyerService implements IFoyerService {

    @Autowired
    private IFoyerRepository foyerRepository; // Injection du repository

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return (List<Foyer>) foyerRepository.findAll(); // Récupérer tous les foyers
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f); // Ajouter un nouveau foyer
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f); // Mettre à jour un foyer existant
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null); // Récupérer un foyer par ID
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepository.deleteById(idFoyer); // Supprimer un foyer par ID
    }
}
