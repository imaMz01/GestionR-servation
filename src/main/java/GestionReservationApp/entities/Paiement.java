package GestionReservationApp.entities;

public class Paiement {

	private int id;
	private double montant;
	public Paiement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paiement(int id, double montant) {
		super();
		this.id = id;
		this.montant = montant;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public void info() {
		System.out.println("********************** Les informations du paiement N°"+id+" ***********************");
		System.out.println("Montant : "+montant);
	}
}
