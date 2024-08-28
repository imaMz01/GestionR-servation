package GestionReservationApp.Controller;

import GestionReservationApp.services.RéservationServiceImp;

public class RéservationController {

	private RéservationServiceImp reservation;

	public RéservationController(RéservationServiceImp reservation) {
		super();
		this.reservation = reservation;
	}

	public RéservationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RéservationServiceImp getReservation() {
		return reservation;
	}

	public void setReservation(RéservationServiceImp reservation) {
		this.reservation = reservation;
	}
	
	
}
