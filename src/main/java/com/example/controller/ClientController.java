
package com.example.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Client;
import entity.Conseiller;

@RestController
public class ClientController {

    @GetMapping("/clients")
    List<Client> findAll() {
    	Client cl1= new Client ("sana","chebi",31);
    	Client cl2= new Client ("hana","chebi",50);
    	Client cl3= new Client ("bob","chat",26);
    	Client cl4= new Client ("ala","chekh",27);
    	ArrayList<Client> listClients = new ArrayList<>();
    	listClients.add(cl1);
    	listClients.add(cl2);
    	listClients.add(cl3);
    	listClients.add(cl4);
        return listClients;
    }
    
    @GetMapping("/conseiller")
    Conseiller findConseiller() {
    	Conseiller c1=new Conseiller("sana","bassasa");
    	
    	Client cl1= new Client ("sana","chebi",31);
    	Client cl2= new Client ("hana","chebi",50);
    	Client cl3= new Client ("bob","chat",26);
    	ArrayList<Client> listClients = new ArrayList<>();
    	
    	listClients.add(cl1);
    	listClients.add(cl2);
    	listClients.add(cl3);
    	
    	c1.setListeClient(listClients);
        return c1;
    	
    }
    
    
    
}   