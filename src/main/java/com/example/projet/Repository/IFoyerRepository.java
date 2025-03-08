package com.example.projet.Repository;

import com.example.projet.Entity.Bloc;
import com.example.projet.Entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoyerRepository extends JpaRepository<Foyer,Long> {
}