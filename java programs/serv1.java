import javax.servlet.*;
import java.io.*;

public class serv1 extends GenericServlet
{
public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
{
  PrintWriter out=response.getWriter();
  out.println("hello KRISHNAPRAKASH");
}

}