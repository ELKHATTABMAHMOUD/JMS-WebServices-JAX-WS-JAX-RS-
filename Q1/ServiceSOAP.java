import  javax.jws.WebService ; 

@WebService(targetNamespace="http://localhost:8080",endpointInterface="IServiceSOAP")
public class ServiceSOAP
{
	public String sayHello( String name){
			return "Bonjour "+name;
	}
}
