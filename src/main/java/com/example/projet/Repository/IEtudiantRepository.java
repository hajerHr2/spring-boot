package com.example.projet.Repository;

import com.example.projet.Entity.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface IEtudiantRepository extends CrudRepository<Etudiant,Long> {

}
