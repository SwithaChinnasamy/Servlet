import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/ViewAllDetails")  
public class ViewAllDetails extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
//out.println("<a href='index.html'>Add New Employee</a>");  
        out.println("<h1>Student List</h1>");  
          
        List<Student_Pojo> list=Student_Operation.getViewAllDetails();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Name</th><th>Regno</th><th>Department</th><th>Cgpa</th><th>Sgpa</th><th>Noofarears</th><th>Attendance</th><th>Result</th><th>Emailid</th></tr>");  
        for(Student_Pojo e:list){  
         out.print("<tr><td>"+e.getName()+"</td><td>"+e.getRegno()+"</td><td>"+e.getDepartment()+"</td><td>"+e.getCgpa()+"</td><td>"+e.getSgpa()+"</td><td>"+e.getNoofarears()+"</td><td>"+e.getAttendance()+"</td><td>"+e.getResult()+"</td><td>"+e.getEmail()+"</td></tr>");  
        }  
        out.print("</table>");  
          
        out.print("<br/>");
        out.print("<br/>");
        out.print("<form action='index.jsp'>");
        out.print("<input type='submit'value='previous'>");
        out.print("</form>");  
        


}  

}  
