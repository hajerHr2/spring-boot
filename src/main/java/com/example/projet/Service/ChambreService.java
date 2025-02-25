package com.example.projet.Service;

import com.example.projet.Entity.Chambre;
import com.example.projet.Repository.IChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChambreService implements IChambreService {

    @Autowired
    private IChambreRepository chambreRepository; // Injection de dépendance

    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) chambreRepository.findAll(); // Récupérer toutes les chambres
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c); // Ajouter une nouvelle chambre
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c); // Mettre à jour une chambre existante
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null); // Récupérer une chambre par ID
    }
}
