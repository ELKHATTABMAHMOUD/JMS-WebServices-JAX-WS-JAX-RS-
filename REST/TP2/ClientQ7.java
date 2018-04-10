import java.lang.*; 
import javax.ws.rs.client.*;
import org.glassfish.jersey.client.*;
import javax.ws.rs.core.*;


import javax.ws.rs.core.MediaType;


public class ClientQ7 {
	
		public static void main(String[] args){
			
			ClientConfig cliConf = new ClientConfig();
			Client client = ClientBuilder.newClient(cliConf);
			WebTarget webTarg = client.target("http://localhost:8080/tp2Q7");
			
			// instation the contact 
			carnet.Contact contact = new carnet.Contact("mahmoud", "3") ; 
			
			//Adding Contact 
			Response response = webTarg.path("rest").path("carnet").path("update").request().put(Entity.entity(contact,MediaType.APPLICATION_XML),Response.class) ;
			
			System.out.println(response.toString());
			
			
		}
	
}
