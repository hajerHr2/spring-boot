package com.example.projet.Repository;

import com.example.projet.Entity.Bloc;
import com.example.projet.Entity.Chambre;
import org.springframework.data.repository.CrudRepository;

public interface IChambreRepository extends CrudRepository<Chambre,Long> {
}
