import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 

@WebServlet("/EditStudent1")

public class EditStudent1 extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("Update Operations");
        String name=request.getParameter("name");

        Student_Pojo pojo=Student_Operation.getResultMethod(name);
                out.print("<form action='EditStudent' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td>Name:</td><td><input type='text'name='name' value='"+pojo.getName()+"'/></td></tr>");  
        out.print("<tr><td>Regno:</td><td><input type='text' name='regno' value='"+pojo.getRegno()+"'/></td></tr>");  
        out.print("<tr><td>Department:</td><td><input type='text' name='department' value='"+pojo.getDepartment()+"'/></td></tr>");  
        out.print("<tr><td>Cgpa:</td><td><input type='text' name='cgpa' value='"+pojo.getCgpa()+"'/></td></tr>");  
        out.print("<tr><td>Sgpa:</td><td><input type='text' name='sgpa' value='"+pojo.getSgpa()+"'/></td></tr>");
        out.print("<tr><td>Noofarears:</td><td><input type='text' name='noofarears' value='"+pojo.getNoofarears()+"'/></td></tr>");
        out.print("<tr><td>Attendance:</td><td><input type='text' name='attendance' value='"+pojo.getAttendance()+"'/></td></tr>");
        out.print("<tr><td>Result:</td><td><input type='text' name='result' value='"+pojo.getResult()+"'/></td></tr>");
        out.print("<tr><td>Email:</td><td><input type='text' name='email' value='"+pojo.getEmail()+"'/></td></tr>");

        out.print("</td></tr>");  
        out.print("<tr><td colspan='2'><input type='submit' value='changing'/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    
 

    }
}
