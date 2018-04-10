import java.lang.*; 
import javax.ws.rs.client.*;
import org.glassfish.jersey.client.*;



public class ClientQ8 {
	
		public static void main(String[] args){
			
			ClientConfig cliConf = new ClientConfig();
			Client client = ClientBuilder.newClient(cliConf);
			WebTarget webTarg = client.target("http://localhost:8080/tp2Q8");
			String result = webTarg.path("rest").path("carnet").path("delete").path("Mahmoud").request().delete(String.class) ;
			
			System.out.println("result : "+result);
			
		}
	
}
