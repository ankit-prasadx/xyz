import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

class Program434
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

            int Ret = 0;
            int Count = 0;
            byte Header[] = new byte[100];

            if(fPackobj.exists())
            {
                while((Ret = fin.read(Header, 0, 100)) > 0)
                {
                    String StrHeadr = new String(Header);

                    String Arr[] = StrHeadr.split(" ");

                    File obj = new File(Arr[0]);
                    obj.createNewFile();

                    System.out.println("New is Dropped with name : "+Arr[0]);
                    int FileSize = Integer.parseInt(Arr[1]);

                    byte DataArray[] = new byte[FileSize];

                    fin.read(DataArray,0,FileSize);

                    FileOutputStream fout = new FileOutputStream(obj);
                    fout.write(DataArray,0,FileSize);

                    Count++;
                }
                System.out.println("---------------------- Summary ----------------------");
                System.out.println("Number of files unpacked succesfully : "+Count);

                System.out.println("Thank you for using Packer Unpacker Application");
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
