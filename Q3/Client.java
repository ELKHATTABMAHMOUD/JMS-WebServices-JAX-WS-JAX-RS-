import java.lang.* ;
import javax.xml.namespace.QName ;
import javax.xml.ws.Service ;
import localhost._8080.*;
import localhost._8080.IServiceSOAP;

public class Client{

    public static void main(String[] args) {
        try {
            ServiceSOAPService s = new ServiceSOAPService();
            IServiceSOAP IMyService = s.getIServiceSOAPPort(); 
            System.out.println(IMyService.sayHello("el khattab"));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
