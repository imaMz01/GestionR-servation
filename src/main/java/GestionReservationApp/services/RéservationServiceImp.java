package GestionReservationApp.services;

import java.util.ArrayList;


import java.util.List;
import java.util.stream.Collectors;

import GestionReservationApp.entities.Réservation;
import GestionReservationApp.enumeration.Etat;


public class RéservationServiceImp implements RéservationService{

	List<Réservation> reservations;
	PaiementServiceImp p;
//	public RéservationServiceImp() {
//		super();
//		reservations=new ArrayList<>();
//		// TODO Auto-generated constructor stub
//	}

	
	@Override
	public void add(Réservation r) {
		// TODO Auto-generated method stub
		if(r.getEvenement().getId()!=0) {
			if(r.getEvenement().getNombreDePlaces()>0 ) {
				reservations.add(r);
				r.getEvenement().setNombreDePlaces(r.getEvenement().getNombreDePlaces()-1);
				System.out.println("Votre réservation est bien enregistrée");
			}
			else{
				System.out.println("Le nombre de place n'est pas suffisant");
			}
		}
		else {
			System.out.println("L'événement n'existe pas");
		}
	}

	public List<Réservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Réservation> reservations) {
		this.reservations = reservations;
	}

	public PaiementServiceImp getP() {
		return p;
	}

	public void setP(PaiementServiceImp p) {
		this.p = p;
	}

	@Override
	public void cancel(int id) {
		// TODO Auto-generated method stub
		reservations.stream()
		.filter(elmt -> elmt.getId()==id).findFirst().ifPresentOrElse(e -> {
			e.setEtat(Etat.annulée);
			System.out.println("Votre réservation est annulée");
		}
			, ()->{
				System.out.println("La réservation n'existe pas");
			});
	}

	@Override
	public List<Réservation> list() {
		// TODO Auto-generated method stub
		return reservations;
	}

	@Override
	public Réservation update(Réservation r) {
		// TODO Auto-generated method stub
		reservations.stream()
		.filter(elmt -> elmt.getId()==r.getId()).findFirst().ifPresent(e ->{
			e.setEtat(r.getEtat());
			e.setEvenement(r.getEvenement());
			e.setUtilisateur(r.getUtilisateur());
		});
		return r;
	}

	@Override
	public List<Réservation> list(int id) {
		// TODO Auto-generated method stub
		return reservations.stream()
				.filter(elmt -> elmt.getUtilisateur().getId()==id).collect(Collectors.toList());
	}
	
}
