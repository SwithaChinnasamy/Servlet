import java.io.*; 
import java.sql.*; 
import java.sql.Date; 
import java.text.ParseException;
import javax.servlet.ServletException; 
import javax.servlet.http.*; 
import java.util.*;

public class Student_Operation
{

    public static int insert(Student_Pojo pojo)
    {
        int status=0;
        try{
            Connection con = Student_Main.getConnection();
            PreparedStatement pre = con.prepareStatement("insert into studregistration values(?,?,?,?,?,?,?,?,?)");
            //pre.executeUpdate("insert in studreg values(?,?,?,?,?,?,?)");
            pre.setString(1,pojo.getName());
            pre.setInt(2,pojo.getRegno());
            pre.setString(3,pojo.getDepartment());
            pre.setInt(4,pojo.getCgpa());
            pre.setInt(5,pojo.getSgpa());
            pre.setInt(6,pojo.getNoofarears());
            pre.setString(7,pojo.getAttendance());
            pre.setString(8,pojo.getResult());
            pre.setString(9,pojo.getEmail());

            status=pre.executeUpdate();

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    return status;
        
}


public static int update(Student_Pojo pojo)
    {
       int status=0;
       try
       {
           Connection con = Student_Main.getConnection();
           PreparedStatement pre = con.prepareStatement("update studregistration set regno=?,department=?,cgpa=?,sgpa=?,noofarears=?,attendance=?,result=?,email=? where name=?");
           
           
           pre.setInt(1,pojo.getRegno());
           pre.setString(2,pojo.getDepartment());
           pre.setInt(3,pojo.getCgpa());
           pre.setInt(4,pojo.getSgpa());
           pre.setInt(5,pojo.getNoofarears());
           pre.setString(6,pojo.getAttendance());
           pre.setString(7,pojo.getResult());
           pre.setString(8,pojo.getEmail());
           pre.setString(9,pojo.getName());
           
           status=pre.executeUpdate();
           con.close();

       }
       catch(Exception e)
       {
           System.out.println(e);
       }
           return status;
       }
public static Student_Pojo getResultMethod(String name)
{
Student_Pojo pojo=new Student_Pojo();
try{
Connection c=Student_Main.getConnection();
PreparedStatement pre=c.prepareStatement("select * from studregistration where name=?");
pre.setString(1,name);
ResultSet rs=pre.executeQuery();

while(rs.next())
{
pojo.setName(rs.getString(1));
pojo.setRegno(rs.getInt(2));
pojo.setDepartment(rs.getString(3));
pojo.setCgpa(rs.getInt(4));
pojo.setSgpa(rs.getInt(5));
pojo.setNoofarears(rs.getInt(6));
pojo.setAttendance(rs.getString(7));
pojo.setResult(rs.getString(8));
pojo.setEmail(rs.getString(9));


}
c.close();


}
catch(Exception e)
{
System.out.println(e);
}
    return pojo;
}

public static List<Student_Pojo> getViewAllDetails(){  
        List<Student_Pojo> list=new ArrayList<Student_Pojo>();  
          
        try{  
            Connection con=Student_Main.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from studregistration");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
               Student_Pojo  pojo=new Student_Pojo();  
                pojo.setName(rs.getString(1));
                pojo.setRegno(rs.getInt(2));
                pojo.setDepartment(rs.getString(3));
                pojo.setCgpa(rs.getInt(4));
                pojo.setSgpa(rs.getInt(5));
                pojo.setNoofarears(rs.getInt(6));
                pojo.setAttendance(rs.getString(7));
                pojo.setResult(rs.getString(8));
                pojo.setEmail(rs.getString(9));
              list.add(pojo);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  

    }  
     public static int delete(String name){  
        int status=0;  
        try{  
            Connection con=Student_Main.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from studregistration where name=?");  
            ps.setString(1,name);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
   
}




