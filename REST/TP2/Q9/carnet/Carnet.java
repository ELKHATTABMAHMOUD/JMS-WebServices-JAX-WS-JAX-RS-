package carnet ;

import java.lang.*;
import java.util.*;

public class Carnet{
	
	private List<Contact> contacts ; 
	
	public Carnet(){
		this.contacts = new ArrayList<Contact>(2);
		this.contacts.add(new Contact("mahmoud","1"));
		this.contacts.add(new Contact("el khattab","2"));
	}
	
	public List<Contact> getContacts(){
		return this.contacts ; 
	}
	public void setContacts(List<Contact> contacts ){
		 this.contacts = contacts  ; 
	}
	
	public String toString(){
		String strCon = "";
		for(Contact contact : contacts){
				strCon+= contact.toString();
		}
		return strCon ; 
	}
	
}
