import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.Filter.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="Login2",urlPatterns="/LoginPage")
public class LoginPage implements Filter   {
       public void init(FilterConfig fc) throws ServletException {}
   
/*protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        String user = request.getParameter("user");
        String pswd = request.getParameter("password");

        if(user.equals("admin") && pswd.equals("admin"))
        {
            response.sendRedirect("success.html");
        }
        else
        {
            response.sendRedirect("error.html");
        }
    }
}*/
    
    public void doFilter(ServletRequest request,ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");
        String pswd = request.getParameter("password");
        //out.println("<img src='/images/col1.jpg' alt='success'/>");

        if(user.equals("admin"))
        {
         chain.doFilter(request, response);   
        }
        else
        {
            out.println("You have enter a wrong password");
            RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
            rs.include(request, response);
        }
    }
   public void destroy() { }
}