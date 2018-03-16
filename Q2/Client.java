import java.lang.* ;
import javax.xml.namespace.QName ;
import javax.xml.ws.Service ;
import java.net.URL ; 

public class Client{

    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/WSSOAP/ServiceSOAPService?wsdl");
            QName qn = new QName("http://localhost:8080","ServiceSOAPService");
            
            Service s = Service.create(url, qn);
            IServiceSOAP IMyService = s.getPort(IServiceSOAP.class);
            String str = IMyService.sayHello("el khattab");
            System.out.println(str);
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
