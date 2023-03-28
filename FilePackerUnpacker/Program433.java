import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

class Program433
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

            FileInputStream fin = new FileInputStream(fPackobj);

            if(fPackobj.exists())
            {
                System.out.println("Packed file is there...");
                byte Header[] = new byte[100];

                fin.read(Header, 0, 100);

                String StrHeadr = new String(Header);

                System.out.println(StrHeadr);

                String Arr[] = StrHeadr.split(" ");

                System.out.println("File Name : "+Arr[0]);
                System.out.println("File Size : "+Arr[1]);

                File obj = new File(Arr[0]);
                obj.createNewFile();

                int FileSize = Integer.parseInt(Arr[1]);

                byte DataArray[] = new byte[FileSize];

                fin.read(DataArray,0,FileSize);

                FileOutputStream fout = new FileOutputStream(obj);
                fout.write(DataArray,0,FileSize);
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
