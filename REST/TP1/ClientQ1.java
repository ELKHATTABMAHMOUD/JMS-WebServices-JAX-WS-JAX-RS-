import java.lang.*; 
import javax.ws.rs.client.*;
import org.glassfish.jersey.client.*;



public class ClientQ1 {
	
		public static void main(String[] args){
			
			ClientConfig cliConf = new ClientConfig();
			Client client = ClientBuilder.newClient(cliConf);
			WebTarget webTarg = client.target("http://localhost:8080/restQ1");
			String result = webTarg.path("hello").request().get(String.class) ;
			
			System.out.println("web service result is : "+result);
			
		}
	
}
