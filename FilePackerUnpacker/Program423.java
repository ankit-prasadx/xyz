import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

class Program423
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("---------------------- Packer Unpacker CUI Panel ----------------------");

        try
        {
            System.out.println("Enter the name of packed file that you want to create : ");
            System.out.println("Note : Packed file should be in the current directory");

            String PackFile = sobj.nextLine();

            File fPackobj = new File(PackFile);

            FileInputStream fout = new FileInputStream(fPackobj);

            if(fPackobj.exists())
            {
                System.out.println("Packed file is there...");
            }
            else
            {
                System.out.println("There is no such file...");
            }
        }// End of Try
        catch(Exception eobj)
        {
            System.out.println("Exception Occured : "+eobj);
        }
    }// end of main
}//end of class
