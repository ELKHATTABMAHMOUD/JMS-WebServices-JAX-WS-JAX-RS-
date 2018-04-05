package hello ;

import javax.ws.rs.* ;


@Path("/")
public class Hello{
	
	@Path("/hello")
	@GET
	@Produces("text/xml")
	public String hello(){
			return "<salut>Hello mahmoud</salut>" ;
	}
	@Path("/ola")
	@GET
	@Produces("text/html")
	public String ola(){
			return "Olà mahmoud" ;
	}
}
