package com.example.projet.Repository;

import com.example.projet.Entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlocRepository extends JpaRepository<Bloc,Long> {
}