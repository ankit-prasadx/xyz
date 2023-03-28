import java.io.*;
import java.util.*;

class Program412
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter Folder name : ");
            String FolderName = sobj.nextLine();

            File fobj = new File(FolderName);

            if(fobj.exists())
            {
                File allFiles[] = fobj.listFiles();

                System.out.println("Number of Files are : "+allFiles.length);
            }
            else
            {
                System.out.println("There is no such folder...");
            }
        }// End of Try
        catch(Exception eobj)
        {
            System.out.println("Exception Occured : "+eobj);
        }
    }// end of main
}//end of class
