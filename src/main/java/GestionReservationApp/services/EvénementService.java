package GestionReservationApp.services;

import java.time.LocalDate;

import java.util.List;

import GestionReservationApp.entities.Evénement;

public interface EvénementService {

	Evénement add(Evénement e);
	Evénement update(Evénement e);
	void remove(int id);
	Evénement findById(int id);
	List<Evénement> list();
	Evénement filtre(String nom);
	List<Evénement> filtree(String lieu);
	List<Evénement> filtre(LocalDate date);
}
