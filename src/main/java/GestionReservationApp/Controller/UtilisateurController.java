package GestionReservationApp.Controller;

import GestionReservationApp.services.UtilisateurServiceImp;

public class UtilisateurController {

	private UtilisateurServiceImp user;

	public UtilisateurController(UtilisateurServiceImp user) {
		super();
		this.user = user;
	}

	public UtilisateurController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UtilisateurServiceImp getUser() {
		return user;
	}

	public void setUser(UtilisateurServiceImp user) {
		this.user = user;
	}
	
	
}
