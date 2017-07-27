import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/StudentDelete")  
public class StudentDelete extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
        String name=request.getParameter("name");  
      //  int regno1=Integer.parseInt(regno);  
        Student_Operation.delete(name);  
        response.sendRedirect("ViewAllDetails");  
    }  
}  