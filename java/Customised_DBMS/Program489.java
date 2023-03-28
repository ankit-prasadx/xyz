import java.util.*;


class Student
{
    public String Sname;
    public int Marks;
    public static int Rollno;

    static
    {
        Rollno = 0;
    }
    public Student(String str, int no)
    {
        this.Sname = str;
        this.Marks = no;
        Rollno++;
    }

    public void Display()
    {
        System.out.println("Roll No : "+Rollno+" Name : "+this.Sname+" Marks : "+this.Marks);
    }
}

class Program489
{
    public static void main(String arg[])
    {
        Student obj1 = new Student("Kartik", 89);
        Student obj2 = new Student("Rutuja", 91);
        Student obj3 = new Student("Anuj", 71);

        obj1.Display();
        obj2.Display();
        obj3.Display();
    }
}