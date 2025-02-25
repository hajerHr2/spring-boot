package com.example.projet.Controller;

import com.example.projet.Entity.Etudiant;
import com.example.projet.Service.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {

    @Autowired
    private IEtudiantService etudiantService;

    // Liste de tous les étudiants
    @GetMapping("/all")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    // Etudiant par ID
    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@PathVariable("id") long id) {
        return etudiantService.retrieveEtudiant(id);
    }

    // Créer de nouveaux étudiants
    @PostMapping("/add")
    public List<Etudiant> createEtudiants(@RequestBody List<Etudiant> etudiants) {
        return etudiantService.addEtudiants(etudiants);
    }

    // Mettre à jour un étudiant


    // Supprimer un étudiant
    @DeleteMapping("/delete/{id}")
    public void deleteEtudiant(@PathVariable("id") long id) {
        etudiantService.removeEtudiant(id);
    }
}
