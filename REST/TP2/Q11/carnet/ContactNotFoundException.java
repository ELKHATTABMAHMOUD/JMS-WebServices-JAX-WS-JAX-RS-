package carnet ;
import java.lang.* ; 
import javax.ws.rs.WebApplicationException ; 
import javax.ws.rs.core.Response ; 

public class ContactNotFoundException extends WebApplicationException{
	
	public ContactNotFoundException(){
		super();
	}
	
	public Response getResponse(){
		return Response.status(Response.Status.NOT_FOUND).entity("Contact inconnu").build();
	}

}
