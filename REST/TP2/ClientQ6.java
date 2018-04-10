import java.lang.*; 
import javax.ws.rs.client.*;
import org.glassfish.jersey.client.*;
import javax.ws.rs.core.*;


import javax.ws.rs.core.MediaType;


public class ClientQ6 {
	
		public static void main(String[] args){
			
			ClientConfig cliConf = new ClientConfig();
			Client client = ClientBuilder.newClient(cliConf);
			WebTarget webTarg = client.target("http://localhost:8080/tp2Q6");
			
			// instation the contact 
			carnet.Contact contact = new carnet.Contact("el khattab mahmoud", "5") ; 
			
			//Adding Contact 
			String response = webTarg.path("rest").path("carnet").path("newContact").request().post(Entity.entity(contact,MediaType.APPLICATION_XML),String.class) ;
			
			// adding contact result
			System.out.println("Le résultat d'ajout : "+response);
			
			
		}
	
}
