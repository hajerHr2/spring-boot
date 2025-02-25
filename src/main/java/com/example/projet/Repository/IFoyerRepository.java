package com.example.projet.Repository;

import com.example.projet.Entity.Bloc;
import com.example.projet.Entity.Foyer;
import org.springframework.data.repository.CrudRepository;

public interface IFoyerRepository extends CrudRepository<Foyer,Long> {
}
