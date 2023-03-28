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

        Scanner sobj = new Scanner(System.in);
        
        String Query;
        int QuerySize = 0;

        while(true)
        {
            Query = "";
            System.out.print("MyDBMS :> ");
            Query = sobj.nextLine();

            String Tokens[] = Query.split(" ");
            QuerySize = Tokens.length;

            if(QuerySize == 1)
            {
                if("help".equals(Tokens[0]))
                {
                    System.out.println("This application is used to demonstrate the features of customised DBMS");
                    System.out.println("Display all Data : select * from student");
                    System.out.println("Insert new record : insert into student values Name Marks");
                    System.out.println("Terminate the project : exit");
                }

                else if("exit".equals(Tokens[0]))
                {
                    System.out.println("Thank You for using MyDMBS");
                    break;
                }
            }

            else if(QuerySize == 2)
            {

            }

            else if(QuerySize == 3)
            {

            }

            else if(QuerySize == 4)
            {

            }

        }// end of while
    }// end of startDBMS

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

class Program501
{
    public static void main(String arg[])
    {
        DBMS dobj = new DBMS();

        dobj.StartDBMS();



    }
}