package carnet ;

import javax.ws.rs.* ;


@Path("/carnet")
public class Annuaire{
	
	private static Carnet carnet = new Carnet() ; 
	
	
	@GET
	@Produces("text/html")
	public String allContacts(){
		if(carnet.getContacts().size() ==0)
			return "Liste Vide" ;
		return carnet.toString();	
		
	}
	@Path("/{name}")
	@GET
	@Produces("text/html")
	public String getContact(@PathParam("name") String name){
		for(Contact contact : this.carnet.getContacts()){
			if(contact.getNom().equals(name))
				return contact.getNumero();
		}
		return "Inconnu";	
		
	}
	
}
