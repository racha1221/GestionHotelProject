package modelHotel;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Conso {
	public int qte;
    Produit prod ;
    Sejour sejour ;
    
    public Conso(int q) {
    	qte = q ;
    }
    
    public Conso(int q, Produit p ,Sejour s) {
    	qte = q ;
    	prod = p ;
    	sejour = s ;
    }

    
}
