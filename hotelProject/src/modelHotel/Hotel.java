package modelHotel;


import java.io.*;
import java.util.*;


public class Hotel {
	public String nom;
    public String adresse;
    public int nbr_etoile;
    public int tel_hotel;
    public String email_hotel;
    
   Vector <Chambre>listeChambre = new Vector<Chambre>();
   Vector <Client>listeClient = new Vector<Client>();
   Vector <Produit>listProd = new Vector<Produit>();
    
    public Hotel(String n ,String a ,int ne ,int t ,String e) {
    	nom = n ;
    	adresse = a ;
    	nbr_etoile = ne ;
    	tel_hotel = t ;
    	email_hotel = e ;	
    }
    
   public  void ajouterChambre(Chambre c) {
	   listeChambre.add(c);  	
    }

   public  void ajouterClient(Client c) {
	   listeClient.add(c);
    }
   public  void ajouterProduit(Produit p) {
	   listProd.add(p);
	   
  }
    
    

}
