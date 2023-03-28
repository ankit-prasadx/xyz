import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;


class Program408
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
            int size = 0;
            while((Ret = fiobj.read(Buffer)) != -1)
            {
                size = size + Ret;
                // str = new String(Buffer,StandardCharsets.UTF_8);
                // System.out.println(str);
            }
            System.out.println("Number of bytes are : "+size);
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}