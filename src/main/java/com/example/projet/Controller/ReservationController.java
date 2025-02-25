package com.example.projet.Controller;

import com.example.projet.Entity.Reservation;
import com.example.projet.Service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private IReservationService reservationService;

    // Liste de toutes les réservations
    @GetMapping("/all")
    public List<Reservation> getAllReservations() {
        return reservationService.retrieveAllReservation();
    }

    // Réservation par ID
    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable("id") String id) {
        return reservationService.retrieveReservation(id);
    }

    // Créer une réservation
    @PostMapping("/add")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    // Mettre à jour une réservation


    // Supprimer une réservation

}
