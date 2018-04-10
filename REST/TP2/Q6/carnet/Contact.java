package carnet ;

import java.lang.*;
import java.util.*;
import javax.xml.bind.annotation

@XmlRootElement
public class Contact{
	
	private String nom ; 
	private String numero ; 
	
	public Contact(){
			this.nom = "default name"; 
			this.numero = 0 ; 
	}
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
