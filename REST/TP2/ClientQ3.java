import java.lang.*; 
import javax.ws.rs.client.*;
import org.glassfish.jersey.client.*;
import javax.ws.rs.core.*;


import javax.ws.rs.core.MediaType;


public class ClientQ3 {
	
		public static void main(String[] args){
			
			ClientConfig cliConf = new ClientConfig();
			Client client = ClientBuilder.newClient(cliConf);
			WebTarget webTarg = client.target("http://localhost:8080/tp2Q3");
			
			String name="mahmoud";
			String number ="3";
			Form form = new Form();
			
			form.param("number", number);
			form.param("name", name);
			
			Response response = webTarg.path("carnet").path("addContact").request(MediaType.APPLICATION_FORM_URLENCODED).post(Entity.form(form)) ;
			
			String value = response.readEntity(String.class);
			System.out.println(" Voir contact ajouté : "+value);
			
			
		}
	
}
