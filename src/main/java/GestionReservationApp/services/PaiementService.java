package GestionReservationApp.services;

import java.util.List;

import GestionReservationApp.entities.Paiement;


public interface PaiementService {

	Paiement add(Paiement p);
	List<Paiement> list();
}
