package GestionReservationApp.services;

import java.util.ArrayList;

import java.util.List;

import GestionReservationApp.entities.Paiement;



public class PaiementServiceImp implements PaiementService{

	List<Paiement> paiements;
	double s=0;

//	public PaiementServiceImp() {
//		super();
//		this.paiements = new ArrayList<>();
//	}
	
	@Override
	public Paiement add(Paiement p) {
		// TODO Auto-generated method stub
		if(!paiements.contains(p))
			paiements.add(p);
		return p;
	}

	public List<Paiement> getPaiements() {
		return paiements;
	}

	public void setPaiements(List<Paiement> paiements) {
		this.paiements = paiements;
	}

	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	@Override
	public List<Paiement> list() {
		// TODO Auto-generated method stub
		return paiements;
	}
	public double revenus() {
		return paiements.stream().mapToDouble(value -> value.getMontant()).sum();
	}
	
}
