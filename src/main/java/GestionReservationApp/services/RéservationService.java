package GestionReservationApp.services;

import java.util.List;

import GestionReservationApp.entities.Réservation;


public interface RéservationService {

	void add(Réservation r);
	Réservation update(Réservation r);
	void cancel(int id);
	List<Réservation> list();
	List<Réservation> list(int id);
}
