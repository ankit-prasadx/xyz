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

    public void DisplayX()
    {
        System.out.println(Rollno+"\t"+this.Sname+"\t"+this.Marks);
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

    // All SQL queries be implemented here

    // insert into student values(_____, ______);
    public void Insert(String str, int no)
    {
        Student sobj = new Student(str, no);
        lobj.add(sobj);
    }

    public void DisplayAll()
    {
        for(Student sref : lobj)
        {
            sref.Display();
        }
    }

    public void DisplayAllX()
    {
        System.out.println("Roll No\tName\tMarks");
        
        for(Student sref : lobj)
        {
            sref.DisplayX();
        }
    }

    // select * from student where Roll no = 3

    public void DisplaySpecific(int value)
    {
        for(Student sref : lobj)
        {
            if(sref.Rollno == value)
            {
                sref.Display();
                break;
            }
        }
    }

    // select * from student where name = 'Rutuja';

    public void DisplaySpecific(String str)
    {
        for(Student sref : lobj)
        {
            if(str.equals(sref.Sname))
            {
                sref.Display();
            }
        }
    }

}

class Program497
{
    public static void main(String arg[])
    {
        DBMS dobj = new DBMS();

        dobj.StartDBMS();

        dobj.Insert("Kartik", 90);
        dobj.Insert("Rutuja", 96);
        dobj.Insert("Ankit", 80);
        dobj.Insert("Pooja", 67);

        dobj.DisplayAll();

        // dobj.DisplayAllX();
        
        dobj.DisplaySpecific(3);
        dobj.DisplaySpecific("Rutuja");
    }
}