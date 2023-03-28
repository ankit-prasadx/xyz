import java.io.*;
import java.util.*;

class Program409
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter the source file name : ");
            String Source = sobj.nextLine();

            System.out.println("Enter the destination file name : ");
            String Destination = sobj.nextLine();

            File fSource = new File(Source);
            File fDest = new File(Destination);

            boolean bret = fSource.exists();
            if(bret == false)
            {
                System.out.println("Source File does not exist!!!");
                return;
            }

            bret = fDest.createNewFile();
            if(bret == false)
            {
                System.out.println("Unable to create destination file...");
                return;
            }

        }// End of Try
        catch(Exception eobj)
        {
            System.out.println("Exception Occured : "+eobj);
        }
    }// end of main
}//end of class
