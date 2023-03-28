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

    // delete from student where Rollno = 3;
    public void Delete(int no)
    {
        int index = 0;

        for(Student serf : lobj)
        {
            if(serf.Rollno == no)
            {
                lobj.remove(index);
                break;
            }
            index++;
        }
    }

    // delete from student where Sname = 'Ram';
    public void Delete(String str)
    {
        int index = 0;

        for(Student serf : lobj)
        {
            if(str.equals(serf.Sname))
            {
                lobj.remove(index);
                break;
            }
            index++;
        }
    }

    //
    public void Sum()
    {
        int iSum = 0;

        for(Student serf : lobj)
        {
            iSum = iSum + (serf.Marks);
        }

        System.out.println("Summation of marks : "+iSum);
    }

    public void Max()
    {
        int iMax = 0;

        for(Student serf : lobj)
        {
            if(iMax < serf.Marks)
            {
                iMax = serf.Marks;
            }
        }

        System.out.println("Maximum marks is : "+iMax);
    }

    public void Min()
    {
        Student s = lobj.getFirst();
        int iMin = s.Marks;

        for(Student serf : lobj)
        {
            if(iMin > serf.Marks)
            {
                iMin = serf.Marks;
            }
        }

        System.out.println("Minimum marks is : "+iMin);
    }

    public void Mean()
    {
        int iSum = 0;

        for(Student sref : lobj)
        {
            iSum = iSum + (sref.Marks);
        }

        System.out.println("Average of marks : "+(iSum / lobj.size()));
    }
}

class Program500
{
    public static void main(String arg[])
    {
        DBMS dobj = new DBMS();

        dobj.StartDBMS();

        dobj.Insert("Kartik", 90);
        dobj.Insert("Rutuja", 96);
        dobj.Insert("Ankit", 80);
        dobj.Insert("Pooja", 67);
        dobj.Insert("Ram", 77);

        dobj.DisplayAll();

        // dobj.DisplayAllX();
        
        dobj.Sum();

        dobj.Max();

        dobj.Min();

        dobj.Mean();
        
        // System.out.println("Final Data");
        // dobj.DisplayAll();
    }
}