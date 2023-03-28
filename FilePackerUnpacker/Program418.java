import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

class Program418
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter Folder name : ");
            String FolderName = sobj.nextLine();

            File fobj = new File(FolderName);

            System.out.println("Enter the name of packed file : ");
            String PackFile = sobj.nextLine();

            File fPackobj = new File(PackFile);
            fPackobj.createNewFile();

            FileOutputStream fout = new FileOutputStream(fPackobj);

            if(fobj.exists())
            {
                File allFiles[] = fobj.listFiles();

                System.out.println("Number of Files are : "+allFiles.length);

                System.out.println("File names and size are : ");

                byte Buffer[] = new byte[1024];
                int Ret = 0;

                String name;

                for(int i = 0; i < allFiles.length; i++)
                {
                    name = allFiles[i].getName();

                    if(name.endsWith(".txt"))
                    {
                        System.out.println("File name : "+allFiles[i].getName()+" Size : "+allFiles[i].length());
    
                        FileInputStream fiobj = new FileInputStream(allFiles[i]);
    
                        while((Ret = fiobj.read(Buffer)) != -1)
                        {
                            fout.write(Buffer,0,Ret);
                        }
                    }
                }
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
