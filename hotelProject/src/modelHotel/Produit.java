package modelHotel;


import java.io.*;
import java.util.*;

/**
 * 
 */
public class Produit {
	public String libelle;
	public float prix;
	public int id;
	 //public enum size;
	
    Hotel hotel ; // ajouter sur l'uml
	Vector<Conso> listeCons = new Vector<Conso>();
    
    public Produit(String l , float p , int i) {
    	libelle = l ;
    	prix = p ;
    	id = i ;
    }
    
    public Produit(String l , float p , int i , Hotel h) {
    	libelle = l ;
    	prix = p ;
    	id = i ;
    	hotel = h ;
    }
    
    public void ajouterConsomation(Conso c) {
    	listeCons.add(c);
    }


    

    

}