package entity;

import java.util.ArrayList;


public class Conseiller {
private String nom;
private String prenom;
private ArrayList<Client>listeClient=new ArrayList<Client>();



public Conseiller() {
	super();
}

public Conseiller(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	}




public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public ArrayList<Client> getListeClient() {
	return listeClient;
}
public void setListeClient(ArrayList<Client> listeClient) {
	this.listeClient = listeClient;
}
}
