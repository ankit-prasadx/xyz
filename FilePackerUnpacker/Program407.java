import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;


class Program407
{
    public static void main(String arg[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter File name :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);
        String str;

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            byte Buffer[] = new byte[100];
            int Ret = 0;

            while((Ret = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer,StandardCharsets.UTF_8);
                System.out.println(str);
            }
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}