import java.io.*; 
import java.sql.*; 
import java.sql.Date; 
import java.text.ParseException;
import javax.servlet.ServletException; 
import javax.servlet.http.*; 

public class Student_Main
{
    public static Connection getConnection()
    {
   Connection con = null;
   try
       
       
       {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","");
       }
   
    
        catch(Exception e)
       {
         System.out.println(e);
       }
       return con;
    }
}
