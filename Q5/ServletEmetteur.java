import javax.servlet.*;
import javax.servlet.http.*;
import java.io.* ;
import javax.jms.* ; 
import javax.naming.* ; 
import java.lang.* ; 
import localhost._8080.* ;

public class ServletEmetteur extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException 
	{
		try {
			
			String name = req.getParameter("message");
            ServiceSOAPService s = new ServiceSOAPService();
            IServiceSOAP IMyService = s.getIServiceSOAPPort(); 
            System.out.println(IMyService.sayHello(name));
            req.setAttribute("msg",IMyService.sayHello(name)) ;
            
            PrintWriter out = res.getWriter();
			out.println(IMyService.sayHello(name));
            
            
            
        } catch(Exception e) {
            e.printStackTrace();
        }
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException 
	{
		  doGet(req,res); 
	}
}
