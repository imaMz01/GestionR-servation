package GestionReservationApp.services;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import GestionReservationApp.entities.Utilisateur;

public class UtilisateurServiceImp implements UtilsateurService{
	
	List<Utilisateur> utilisateurs;

//	public UtilisateurServiceImp() {
//		super();
//		utilisateurs=new ArrayList<>();
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public Utilisateur sinscrire(Utilisateur u) {
		// TODO Auto-generated method stub
		if(!utilisateurs.contains(u))
			utilisateurs.add(u);
		return u;
	}

	
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}


	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}


	@Override
	public void seConnecter(String e, String mdp) {
		// TODO Auto-generated method stub
		 utilisateurs.stream()
		.filter(elmt -> elmt.getEmail().equals(e) && elmt.getPwd().equals(mdp))
		.findFirst().ifPresentOrElse((u)->{
			System.out.println("Connexion reussie !!");
		}, ()->{
			System.out.println("Échec de la connexion. Nom d'utilisateur ou mot de passe incorrect");
		});
	}

	@Override
	public void seDeconnecter() {
		// TODO Auto-generated method stub
		System.out.println("Déconnexion réussie");
	}

	@Override
	public List<Utilisateur> list() {
		// TODO Auto-generated method stub
		return utilisateurs;
	}
	

}
