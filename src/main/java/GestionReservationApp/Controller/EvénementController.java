package GestionReservationApp.Controller;

import GestionReservationApp.services.EvénementServiceImp;

public class EvénementController {

	private EvénementServiceImp event;

	public EvénementController(EvénementServiceImp event) {
		super();
		this.event = event;
	}

	public EvénementController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EvénementServiceImp getEvent() {
		return event;
	}

	public void setEvent(EvénementServiceImp event) {
		this.event = event;
	}
	
	
}
