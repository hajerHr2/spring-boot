package com.example.projet.Repository;

import com.example.projet.Entity.Bloc;
import com.example.projet.Entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface IReservationRepository extends CrudRepository<Reservation,String> {
}
