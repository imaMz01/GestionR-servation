package GestionReservationApp.services;

import java.util.List;

import GestionReservationApp.entities.Utilisateur;



public interface UtilsateurService {

	Utilisateur sinscrire(Utilisateur u);
	void seConnecter(String email, String pwd);
	void seDeconnecter();
	List<Utilisateur> list();
}
