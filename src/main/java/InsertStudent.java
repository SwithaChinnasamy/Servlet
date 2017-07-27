import java.io.IOException;  
    import java.io.PrintWriter;  
      import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.io.*;
import java.net.Authenticator;
import java.util.*;

import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

@WebServlet("/InsertStudent")
public class InsertStudent extends HttpServlet
{
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
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
       String result=request.getParameter("result");
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

       int status = Student_Operation.insert(spojo);
    
         if(status > 0)
    {
       out.println("Inserted successfully");
      InsertStudent.sendEmail(email);
      out.print("sending mail....");

    }

   
  else{  
      out.println("Sorry! unable to save record");  
           
   }  
              

   }
public static void sendEmail(String to)
{
final String username = "sindhuja.r@kggroup.com";
final String password = "sindhu@123";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "false");
props.put("mail.smtp.host", "webmail.kggroup.com");
props.put("mail.smtp.port", "25");
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("sindhuja.r@kggroup.com"));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse(to));
message.setSubject("hello !!!");
message.setText("This is an example program for crud operations and send mail.........,"
+ "\n\n No spam to my email, please!");
Transport.send(message);
System.out.println("Done");
}
catch (MessagingException e) 
{
throw new RuntimeException(e);
//System.out.println("Username or Password are incorrect ... exiting !");
}
} 
}  
