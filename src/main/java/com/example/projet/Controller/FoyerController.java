package com.example.projet.Controller;

import com.example.projet.Entity.Foyer;
import com.example.projet.Service.IFoyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyers")
public class FoyerController {

    @Autowired
    private IFoyerService foyerService;

    // Liste de tous les foyers
    @GetMapping("/all")
    public List<Foyer> getAllFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    // Foyer par ID
    @GetMapping("/{id}")
    public Foyer getFoyerById(@PathVariable("id") long id) {
        return foyerService.retrieveFoyer(id);
    }

    // Créer un foyer
    @PostMapping("/add")
    public Foyer createFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    // Mettre à jour un foyer


    // Supprimer un foyer
    @DeleteMapping("/delete/{id}")
    public void deleteFoyer(@PathVariable("id") long id) {
        foyerService.removeFoyer(id);
    }
}
