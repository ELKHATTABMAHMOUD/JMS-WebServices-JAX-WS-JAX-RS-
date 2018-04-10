package carnet ;

import javax.ws.rs.* ;
import javax.ws.rs.core.Response ; 

import java.net.URI ;
import javax.ws.rs.core.*;

@Path("/carnet")
public class Annuaire{
	
	private static Carnet carnet = new Carnet() ; 
	
	@GET
	@Produces("text/html")
	public String allContacts(){
		if(carnet.getContacts().size() == 0)
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
	
	@Path("/addContact")
	@POST
	@Produces("text/plain")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response addContact(@FormParam("name")String name, @FormParam("number") String numero){
		
		for(Contact contact : this.carnet.getContacts()){
			if(contact.getNom().equals(name))
				return Response.created(null).entity("Contact ... déjà existant").build() ;
		}
		if(!name.equals("") && !numero.equals("")){
			
			Contact newContact = new Contact(name, numero);
			carnet.getContacts().add(newContact);			
			Response response = Response.created(URI.create("carnet/"+newContact.getNom())).entity("contact crée").build() ; 
			
			return response;
		}

		return Response.created(null).entity("Vous n'avez pas renseigné numero ou nom.").build() ;
 
	}
	
	@Path("/newContact")
	@POST
	@Produces("text/plain")
	@Consumes(MediaType.APPLICATION_XML)
	public String newContact(Contact newContact){
		
		for(Contact contact : this.carnet.getContacts()){
			if(contact.getNom().equals(newContact.getNom()))
				return "Contact ... déjà existant" ;
		}
		if(!newContact.getNom().equals("") && !newContact.getNumero().equals("")){
			carnet.getContacts().add(newContact);			
			return "ajout";
		}

		return "Vous n'avez pas renseigné numero ou nom." ;
 
	}
	@Path("/update")
	@PUT
	@Produces("text/plain")
	@Consumes(MediaType.APPLICATION_XML)
	public Response updateContact(Contact newContact){
		if(carnet.getContacts().size() == 0){
			return Response.noContent().build() ;
		}
		for(Contact contact : this.carnet.getContacts()){
			System.out.println(contact.getNom()+" :: "+newContact.getNom());
			if(contact.getNom().equals(newContact.getNom())){
				contact.setNumero(newContact.getNumero());
				return Response.created(null).entity("Contact ... modifié").build() ;
			}
		}
		return Response.noContent().build();
 
	}
	
	@Path("/delete/{name}")
	@DELETE
	@Produces("text/plain")
	@Consumes("text/plain")
	public String updateContact(@PathParam("name")String name){
		
		
		for(Contact contact : this.carnet.getContacts()){
			if(contact.getNom().equalsIgnoreCase(name)){
				this.carnet.getContacts().remove(contact);
				return "Contact ... supprimé";
			}
		}
		return "Contact ...introuvable !";
 
	}
	
	
	
	
	
	
}
