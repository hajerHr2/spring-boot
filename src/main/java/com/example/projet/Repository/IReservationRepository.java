package com.example.projet.Repository;

import com.example.projet.Entity.Bloc;
import com.example.projet.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation,String> {
    @Query("SELECT r FROM Reservation r WHERE r.anneeUniversitaire = :anneeUniversitaire AND r.estValide = true")
    List<Reservation> findReservationsByAnneeUniversitaire(Date anneeUniversitaire);
}