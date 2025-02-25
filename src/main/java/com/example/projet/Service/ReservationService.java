package com.example.projet.Service;

import com.example.projet.Entity.Reservation;
import com.example.projet.Repository.IReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService implements IReservationService {

    @Autowired
     IReservationRepository reservationRepository; // Injection du repository

    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) reservationRepository.findAll(); // Récupérer toutes les réservations
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res); // Mettre à jour une réservation existante
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).orElse(null); // Récupérer une réservation par ID
    }


    public Reservation addReservation(Reservation res) {
        return reservationRepository.save(res); // Ajouter une nouvelle réservation
    }


    public void removeReservation(String idReservation) {
        reservationRepository.deleteById(idReservation); // Supprimer une réservation par ID
    }
}
