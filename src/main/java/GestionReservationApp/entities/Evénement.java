package GestionReservationApp.entities;

import java.time.LocalDate;

public class Evénement {

	private int id;
	private String nom;
	private String lieu;
	private LocalDate date;
	private int nombreDePlaces;
	public Evénement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evénement(int id, String nom, String lieu, LocalDate date, int nombreDePlaces) {
		super();
		this.id = id;
		this.nom = nom;
		this.lieu = lieu;
		this.date = date;
		this.nombreDePlaces = nombreDePlaces;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getNombreDePlaces() {
		return nombreDePlaces;
	}
	public void setNombreDePlaces(int nombreDePlaces) {
		this.nombreDePlaces = nombreDePlaces;
	}
	
	public void info() {
		System.out.println("********************* Les informations de l'événemnt N° "+ id+" ******************");
		System.out.println("Nom : "+nom);
		System.out.println("Lieu : " +lieu );
		System.out.println("Date : "+date);
		System.out.println("Nombre de place : "+nombreDePlaces);
	}
	@Override
	public String toString() {
		return "Evénement [id=" + id + ", nom=" + nom + ", lieu=" + lieu + ", date=" + date + ", nombreDePlaces="
				+ nombreDePlaces + "]";
	}
	
	
}
