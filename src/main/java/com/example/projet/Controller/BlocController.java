package com.example.projet.Controller;

import com.example.projet.Entity.Bloc;
import com.example.projet.Service.IBlocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blocs")
public class BlocController {

    @Autowired
    private IBlocService blocService;

    // Liste de tous les blocs
    @GetMapping("/all")
    public List<Bloc> getAllBlocs() {
        return blocService.retrieveBlocs();
    }

    // Bloc par ID
    @GetMapping("/{id}")
    public Bloc getBlocById(@PathVariable("id") long id) {
        return blocService.retrieveBloc(id);
    }

    // Créer un nouveau bloc
    @PostMapping("/add")
    public Bloc createBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    // Mettre à jour un bloc existant


    // Supprimer un bloc
    @DeleteMapping("/delete/{id}")
    public void deleteBloc(@PathVariable("id") long id) {
        blocService.removeBloc(id);
    }
}
