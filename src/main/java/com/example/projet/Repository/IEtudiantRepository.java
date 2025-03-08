package com.example.projet.Repository;

import com.example.projet.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant,Long> {
}