import java.lang.*; 
import javax.ws.rs.client.*;
import org.glassfish.jersey.client.*;



public class ClientQ2 {
	
		public static void main(String[] args){
			
			ClientConfig cliConf = new ClientConfig();
			Client client = ClientBuilder.newClient(cliConf);
			WebTarget webTarg = client.target("http://localhost:8080/tp2Q2");
			String result = webTarg.path("carnet").queryParam("name","Mahmoud").request().get(String.class) ;
			
			System.out.println("le numéro correspondant est : "+result);
			
		}
	
}
