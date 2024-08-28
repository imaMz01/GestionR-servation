package GestionReservationApp;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import GestionReservationApp.Controller.EvénementController;
import GestionReservationApp.Controller.PaiementController;
import GestionReservationApp.Controller.RéservationController;
import GestionReservationApp.Controller.UtilisateurController;
import GestionReservationApp.entities.Evénement;
import GestionReservationApp.entities.Paiement;
import GestionReservationApp.entities.Réservation;
import GestionReservationApp.entities.Utilisateur;

@SpringBootApplication
public class GestionReservationAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GestionReservationAppApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("Configuration/Utilisateur.xml");

		UtilisateurController Pers = (UtilisateurController) context.getBean("UtilisateurController");
		
		Utilisateur u1 =new Utilisateur(1, "nom1", "prenom1", "email1@gmail.com", "pwd1");
		Utilisateur u2 =new Utilisateur(2, "nom2", "prenom2", "email2@gmail.com", "pwd2");
		Utilisateur u3 =new Utilisateur(3, "nom3", "prenom3", "email3@gmail.com", "pwd3");
		Pers.getUser().sinscrire(u1);
		Pers.getUser().sinscrire(u2);
		Pers.getUser().sinscrire(u3);
		System.out.println("*** afficher la liste des utilisateurs ***");
		Pers.getUser().list().forEach(u->u.info());
		System.out.println("*** S'authentifier ***");
		Pers.getUser().seConnecter("email1@gmail.com", "pwd1");
		System.out.println("*** Se deconnecter ***");
		Pers.getUser().seDeconnecter();
		System.out.println("\t\t************\t\t");
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Configuration/Evénement.xml");

		EvénementController event = (EvénementController) context1.getBean("EvénementController");
		System.out.println("*** Ajouter des événements ***");
		Evénement e1=new Evénement(1, "spectacle", "Casablanca", LocalDate.parse("2024-08-12"),2);
		Evénement e2=new Evénement(2, "fashion show", "Casablanca", LocalDate.parse("2024-08-13"),1);
		Evénement e3=new Evénement(3, "festival", "Rabat", LocalDate.parse("2024-08-15"),3);
		event.getEvent().add(e1);
		event.getEvent().add(e2);
		event.getEvent().add(e3);
		System.out.println("*** afficher la liste des événements ***");
		event.getEvent().list().forEach(u->u.info());
		/*System.out.println("*** Modifier un événement ***");
		event.getEvent().update(new Evénement(2, "casa fashion show", "Casablanca", LocalDate.parse("2024-08-13"),3)).info();*/
		System.out.println("*** Supprimer un événement ***");
		event.getEvent().remove(1);
		System.out.println("*** afficher la liste des événements ***");
		event.getEvent().list().forEach(u->u.info()); 
		System.out.println("*** afficher un événement par id ***");
		event.getEvent().findById(2).info(); 
		System.out.println("*** afficher un événement par lieu ***");
		event.getEvent().filtree("Rabat").forEach(el->el.info()); 
		System.out.println("*** afficher un événement par date ***");
		event.getEvent().filtre(LocalDate.parse("2024-08-15")).forEach(el->el.info()); 
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Configuration/Réservation.xml");

		RéservationController res = (RéservationController) context2.getBean("RéservationController");
		PaiementController pai = (PaiementController) context2.getBean("PaiementController");
		System.out.println("*** Ajouter des réservations ***");
		Paiement p1=new Paiement(1, 100);
		Paiement p2=new Paiement(1, 100);
		Paiement p3=new Paiement(1, 100);
		Paiement p4=new Paiement(1, 100);
		Paiement p5=new Paiement(1, 100);
		Paiement p6=new Paiement(1, 100);
		Paiement p7=new Paiement(1, 100);
		pai.getPaiement().add(p1);
		pai.getPaiement().add(p2);
		pai.getPaiement().add(p3);
		pai.getPaiement().add(p4);
		pai.getPaiement().add(p5);
		pai.getPaiement().add(p6);
		pai.getPaiement().add(p7);
		Réservation res1=new Réservation(1, u1, event.getEvent().findById(1),p1);
		Réservation res2=new Réservation(2, u1,  event.getEvent().findById(3),p2);
		Réservation res3=new Réservation(3, u1, event.getEvent().findById(1),p3);
		Réservation res4=new Réservation(4, u2,  event.getEvent().findById(2),p4);
		Réservation res5=new Réservation(5, u3, event.getEvent().findById(3),p5);
		Réservation res6=new Réservation(4, u2, event.getEvent().findById(1),p6);
		Réservation res7=new Réservation(4, u3, event.getEvent().findById(2),p7);
		res.getReservation().add(res1);
		res.getReservation().add(res2);
		res.getReservation().add(res3);
		res.getReservation().add(res4);
		res.getReservation().add(res5);
		res.getReservation().add(res6);
		res.getReservation().add(res7);
		System.out.println("*** afficher la liste des réservations ***");
		res.getReservation().list().forEach(u-> u.info());
		System.out.println("*** afficher la liste des événements ***");
		event.getEvent().list().forEach(u->u.info());
		System.out.println("*** Annuler une reservation ***");
		res.getReservation().cancel(2);
		System.out.println("*** afficher la liste des réservations ***");
		res.getReservation().list().forEach(u-> u.info());
		System.out.println("*** afficher la liste des réservations d'un utilisateur***");
		res.getReservation().list(u1.getId()).forEach(u-> u.info());
		System.out.println("/////Rapport/////");
		System.out.println("Le nombre de réservations : " +res.getReservation().list().size());
		System.out.println("Le revenu : "+pai.getPaiement().revenus() +" DH");
	}

}
