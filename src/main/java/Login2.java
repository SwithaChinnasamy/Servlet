import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.Filter;
import javax.servlet.annotation.WebServlet;
@WebServlet("/LoginPage")

 public class Login2 extends HttpServlet {

 public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
     {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");
        String pswd = request.getParameter("password");
        out.println("Access granted "+user);

        response.sendRedirect("index.jsp");
     }
}