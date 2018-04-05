package carnet ;

import java.lang.*;
import java.util.*;

public class Contact{
	
	private String nom ; 
	private String numero ; 
	
	public Contact(String nom, String numero){
		this.nom = nom ;
		this.numero = numero ; 
	}
	
	public String getNumero(){
			return this.numero ; 
	}
	public String getNom(){
		return this.nom ; 
	}
	public void setNumero(String numero ){
		this.numero = numero  ; 
	}
	public String toString(){
		String strCon = "numero : "+this.getNumero()+"nom : "+this.getNom()+"<br/>";
		return strCon ; 
	}
}
