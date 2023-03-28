import java.util.*;
import java.io.*;


class Program406
{
    public static void main(String arg[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter File name :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            byte Buffer[] = new byte[100];
            int Ret = 0;

            while((Ret = fiobj.read(Buffer)) != -1)
            {
                System.out.println(Buffer);
            }
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}