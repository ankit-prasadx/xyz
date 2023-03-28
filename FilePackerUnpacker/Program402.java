import java.util.*;
import java.io.*;


class Program402
{
    public static void main(String arg[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter File name :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);
        fobj.createNewFile();

        System.out.println("File Name is : "+FileName);
    }
}