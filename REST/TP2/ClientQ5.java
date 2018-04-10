import java.lang.*; 
import javax.ws.rs.client.*;
import org.glassfish.jersey.client.*;
import javax.ws.rs.core.*;


import javax.ws.rs.core.MediaType;


public class ClientQ5 {
	
		public static void main(String[] args){
			
			ClientConfig cliConf = new ClientConfig();
			Client client = ClientBuilder.newClient(cliConf);
			WebTarget webTarg = client.target("http://localhost:8080/tp2Q5");
			
			String name="user4";
			String number ="4";
			
			//Form builder 
			Form form = new Form();
			form.param("number", number);
			form.param("name", name);
			
			//Adding Contact 
			Response uri = webTarg.path("rest").path("carnet").path("addContact").request().post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED),Response.class) ;
			
			System.out.println(" URI : "+uri.getLocation());
			
		//	http://localhost:8080/tp2Q5/rest/carnet/user4
			
			// returned URI
			WebTarget webTarg2 = client.target(uri.getLocation().toString()) ;
			String contactNumber = webTarg2.request().get(String.class) ;
			
			
			
			// Returnd Contact Number
			System.out.println("le numéro du contact récemment ajouté est : "+contactNumber);
			
			
		}
	
}
