package hello ;

import javax.ws.rs.* ;


@Path("/")
public class Hello{
	
	
	@Path("/hello")
	@GET
	@Produces("text/html")
	public String hello(@QueryParam("name") String name){
			return "Hello "+name ;
	}
	
	@Path("/ola")
	@GET
	@Produces("text/html")
	public String ola(@DefaultValue("el khattab") @QueryParam("name") String name){
			return "Ola "+name ;
	}
}
