import  javax.jws.WebService ; 

@WebService(targetNamespace="http://localhost:8080")
public interface IServiceSOAP
{
	public String sayHello( String name) ;
}
