import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

class Program422
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("---------------------- Packer Unpacker CUI Panel ----------------------");

        try
        {
            System.out.println("Enter Folder name which contains the files that you want to pack : ");
            String FolderName = sobj.nextLine();

            File fobj = new File(FolderName);

            System.out.println("Enter the name of packed file that you want to create : ");
            System.out.println("Note : Packed file gets created in current directory");

            String PackFile = sobj.nextLine();

            File fPackobj = new File(PackFile);
            fPackobj.createNewFile();

            FileOutputStream fout = new FileOutputStream(fPackobj);

            if(fobj.exists())
            {
                File allFiles[] = fobj.listFiles();

                System.out.println("File names are : ");

                byte Buffer[] = new byte[1024];
                int Ret = 0;
                int Counter = 0;

                String name;

                for(int i = 0; i < allFiles.length; i++)
                {
                    name = allFiles[i].getName();

                    if(name.endsWith(".txt"))
                    {
                        name = name + " " + (allFiles[i].length());
                        System.out.println("File Name : "+allFiles[i].getName()+" with length : "+allFiles[i].length());

                        for(int j = name.length(); j < 100; j++)    // Header Creation
                        {
                            name = name + " ";
                        }

                        byte HeaderByte[] = name.getBytes();    // String to byte array conversion

                        fout.write(HeaderByte,0,HeaderByte.length);     // writing header in packed file

                        FileInputStream fiobj = new FileInputStream(allFiles[i]);
    
                        while((Ret = fiobj.read(Buffer)) != -1)
                        {
                            fout.write(Buffer,0,Ret);
                        }
                        Counter++;
                    }
                }
                System.out.println("---------------------- Summary ----------------------");
                System.out.println("Number of files scanned : "+allFiles.length);
                System.out.println("Number of files packed successfully : "+ Counter);
                System.out.println("Thankyou for using Packer Unpacker Utility");
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
