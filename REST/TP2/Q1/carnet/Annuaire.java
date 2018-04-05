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
	
}
