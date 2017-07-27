import java.util.*;

public class Student_Pojo
{
    String name,department,attendance,result,email;
    private int regno,cgpa,sgpa,noofarears;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
public void setRegno(int regno)
    {
        this.regno = regno;
    }
    public int getRegno()
    {
        return regno;
    }

public void setDepartment(String departemnt)
    {
        this.department = departemnt;
    }
    public String getDepartment()
    {
        return department;
    }

public void setCgpa(int cgpa)
    {
        this.cgpa = cgpa;
    }
    public int getCgpa()
    {
        return cgpa;
    }

public void setSgpa(int sgpa)
    {
        this.sgpa = sgpa;
    }
    public int getSgpa()
    {
        return sgpa;
    }

public void setNoofarears(int noofarears)
    {
        this.noofarears = noofarears;
    }
    public int getNoofarears()
    {
        return noofarears;
    }

public void setAttendance(String attendance)
    {
        this.attendance = attendance;
    }
    public String getAttendance()
    {
        return attendance;
    }
    public void setResult(String result)
    {
        this.result=result;
    }
public String getResult()
{
    return result;
}
public void setEmail(String email)
{
    this.email=email;
}
public String getEmail()
{
    return email;
}
}