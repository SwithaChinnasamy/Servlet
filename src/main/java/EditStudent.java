import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 

@WebServlet("/EditStudent")

public class EditStudent extends HttpServlet
{
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        int regno = Integer.parseInt(request.getParameter("regno"));
        String department = request.getParameter("department");
        int cgpa = Integer.parseInt(request.getParameter("cgpa"));
        int sgpa = Integer.parseInt(request.getParameter("sgpa"));
        int noofarears = Integer.parseInt(request.getParameter("noofarears"));
        String attendance = request.getParameter("attendance");
        String result = request.getParameter("result");
        String email=request.getParameter("email");

        Student_Pojo spojo = new Student_Pojo();
        spojo.setName(name);
        spojo.setRegno(regno);
        spojo.setDepartment(department);
        spojo.setCgpa(cgpa);
        spojo.setSgpa(sgpa);
        spojo.setNoofarears(noofarears);
        spojo.setAttendance(attendance);
        spojo.setResult(result);
        spojo.setEmail(email);
       

        int status = Student_Operation.update(spojo);
        if(status>0)
        {
            System.out.println("updated successfully......");
        }

        else
        {
         System.out.println("update process going on....");
        }

        response.sendRedirect("ViewAllDetails");
    }
}