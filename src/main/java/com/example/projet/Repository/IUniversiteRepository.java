package com.example.projet.Repository;

import com.example.projet.Entity.Bloc;
import com.example.projet.Entity.Universite;
import org.springframework.data.repository.CrudRepository;

public interface IUniversiteRepository extends CrudRepository<Universite,Long> {
}
