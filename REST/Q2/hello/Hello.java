package hello ;

import javax.ws.rs.* ;


public class Hello{
	
	@GET("/hello")
	@Produces("application/xml")
	public String hello(){
			return "Hello mahmoud" ;
	}
	
	@GET("/ola")
	@Produces("application/html")
	public String ola(){
			return "Hello mahmoud" ;
	}
}
