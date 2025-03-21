package com.example.projet.Repository;

import com.example.projet.Entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre,Long> {
    @Query("SELECT c FROM Chambre c WHERE c.bloc.foyer.universite.nomUniversite = :nomUniversite AND c.typeC = :type AND c.reservations IS EMPTY")
    List<Chambre> findChambresNonReservees(String nomUniversite, TypeChambre type);

    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :idBloc AND c.typeC = :typeC")
    List<Chambre> findChambresParBlocEtTypeJPQL(long idBloc, TypeChambre typeC);

    List<Chambre> findByBlocIdBlocAndTypeC(long idBloc, TypeChambre typeC);

    List<Chambre> findByNumeroChambreIn(List<Long> numChambres);