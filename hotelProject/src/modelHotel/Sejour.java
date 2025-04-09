package modelHotel;


import java.io.*;
import java.util.*;


public class Sejour {
	
	public float facturation ;
	public int idSejour;
	Reservation res ;
    Vector<Conso>cons = new Vector<Conso>();
    
    public Sejour(int i , float f) {
    	idSejour=i;
    	facturation=f;
	
    }
    
    public void setRes(Reservation x) {
    	res = x ;
    }
    
    public void ajouterConsomation(Conso x) {
    	cons.add(x);
    }

    
   

}