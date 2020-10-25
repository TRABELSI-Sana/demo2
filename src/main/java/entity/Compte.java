package entity;

public class Compte {
	private int solde;


 
 
 
 public Compte () {
	 super();
 }
 
 
 public Compte(int solde) {
	super();
	this.solde = solde;
}

public int getSolde() {
	return solde;
}

public void setSolde(int solde) {
	this.solde = solde;
}
}
