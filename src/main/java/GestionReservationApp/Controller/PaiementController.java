package GestionReservationApp.Controller;

import GestionReservationApp.services.PaiementServiceImp;

public class PaiementController {

	private PaiementServiceImp paiement;

	public PaiementController(PaiementServiceImp paiement) {
		super();
		this.paiement = paiement;
	}

	public PaiementController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaiementServiceImp getPaiement() {
		return paiement;
	}

	public void setPaiement(PaiementServiceImp paiement) {
		this.paiement = paiement;
	}
	
	
}
