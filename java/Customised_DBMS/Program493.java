import java.util.*;


class Student
{
    public String Sname;
    public int Marks;
    public int Rollno;
    public static int Generator;

    static
    {
        Generator = 0;
    }
    public Student(String str, int no)
    {
        this.Sname = str;
        this.Marks = no;
        Generator++;
        this.Rollno = Generator;
    }

    public void Display()
    {
        System.out.println("Roll No : "+Rollno+" Name : "+this.Sname+" Marks : "+this.Marks);
    }
}

class DBMS
{
    public LinkedList <Student> lobj;

    public DBMS()
    {
        lobj = new LinkedList<Student>();
    }

    public void StartDBMS()
    {
        System.out.println("Customised DBMS Started Succesfully...");
    }
}

class Program493
{
    public static void main(String arg[])
    {
        DBMS dobj = new DBMS();

        dobj.StartDBMS();
    }
}