package modelHotel;


import java.io.*;
import java.util.*;


public class Client {
	
	public String nom;
    public String prenom;
    public int telephone;
    public String email;
    public String adresse;
    public int contact_urg_tel;
    
	public Hotel hotel ;
	public Vector<Reservation>listeReversions=new Vector<Reservation>();

    
    public Client(String n,String p ,int t,String e,String a,int c) {
    	nom = n ;
    	prenom = p;
    	telephone = t ;
    	email = e ;
    	adresse = a ;
    	contact_urg_tel = c ;
    	
    }

    public Client(String n,String p ,int t,String e,String a,int c,Hotel h) {
    	nom = n ;
    	prenom = p;
    	telephone = t ;
    	email = e ;
    	adresse = a ;
    	contact_urg_tel = c ;
    	hotel = h ;
    	
    }
    
    public  void ajouterRes(Reservation x) {
    	listeReversions.add(x);
    }
    
    

}
