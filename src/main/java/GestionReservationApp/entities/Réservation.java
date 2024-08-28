package GestionReservationApp.entities;

import GestionReservationApp.enumeration.Etat;

public class Réservation {

	private int id;
	private Utilisateur utilisateur;
	private Evénement evenement;
	private Etat etat;
	private Paiement paiement;
	public Réservation(int id, Utilisateur utilisateur, Evénement evenement,Paiement paiement) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.evenement = evenement;
		this.etat=Etat.confirmée;
		this.paiement=paiement;
	}
	public Réservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Evénement getEvenement() {
		return evenement;
	}
	public void setEvenement(Evénement evenement) {
		this.evenement = evenement;
	}
	
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
	public Paiement getPaiement() {
		return paiement;
	}
	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}
	public void info() {
		System.out.println("********************* Les informations de la réservation N° "+ id+" ******************");
		System.out.println("Etat : "+etat);
		System.out.println(utilisateur.toString());
		System.out.println(evenement.toString());
	}
}
