package GestionReservationApp.services;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import GestionReservationApp.entities.Evénement;



public class EvénementServiceImp implements EvénementService{

	List<Evénement> evenements;

//	public EvénementServiceImp() {
//		super();
//		evenements=new ArrayList<>();
//		// TODO Auto-generated constructor stub
//	}

	
	@Override
	public Evénement add(Evénement e) {
		// TODO Auto-generated method stub
		if(!evenements.contains(e))
			evenements.add(e);
		return e;
	}
	

	public List<Evénement> getEvenements() {
		return evenements;
	}


	public void setEvenements(List<Evénement> evenements) {
		this.evenements = evenements;
	}


	@Override
	public Evénement update(Evénement e) {
		// TODO Auto-generated method stub
		evenements.stream()
		.filter(elmt->elmt.getId()==e.getId()).findFirst().ifPresent(el->{
			el.setDate(e.getDate());
			el.setLieu(e.getLieu());
			el.setNom(e.getNom());
			el.setNombreDePlaces(e.getNombreDePlaces());
		});
		return e;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		Optional<Evénement> med=evenements
				.stream()
				.filter(elemt-> elemt.getId()==id).findFirst();
				if(med.isPresent()) {
					evenements.remove(med.get());
				}
	}

	@Override
	public List<Evénement> list() {
		// TODO Auto-generated method stub
		return evenements;
	}

	@Override
	public Evénement findById(int id) {
		// TODO Auto-generated method stub
		return evenements.stream()
		.filter(elmt -> elmt.getId()==id).findFirst().orElse(new Evénement());
	}

	@Override
	public Evénement filtre(String nom) {
		// TODO Auto-generated method stub
		return evenements.stream()
				.filter(el -> el.getNom().equals(nom)).findFirst().orElse(new Evénement());
	}

	@Override
	public List<Evénement> filtree(String lieu) {
		// TODO Auto-generated method stub
		return evenements.stream()
				.filter(el -> el.getLieu().equals(lieu)).collect(Collectors.toList());
	}

	@Override
	public List<Evénement> filtre(LocalDate date) {
		// TODO Auto-generated method stub
		return evenements.stream()
				.filter(el -> el.getDate().equals(date)).collect(Collectors.toList());
	}
	
}
