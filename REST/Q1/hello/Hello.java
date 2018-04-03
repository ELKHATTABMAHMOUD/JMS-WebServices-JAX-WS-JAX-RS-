package hello ;

import javax.ws.rs.* ;

@Path("/hello")
public class Hello{
	
	@GET()
	public String sayHello(){
			return "Hello mahmoud" ;
	}
	
}
