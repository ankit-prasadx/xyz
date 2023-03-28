import java.io.*;
import java.util.*;

class Program429
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String str = sobj.nextLine();

        String Arr[] = str.split(" ");

        int iCount = 0;
        
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].equals("Demo"))
            {
                iCount++;
            }
        }
        System.out.println("Frequency od Demo word is : "+iCount);

    }// end of main
}//end of class
