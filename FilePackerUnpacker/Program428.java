import java.io.*;
import java.util.*;

class Program428
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String str = sobj.nextLine();

        String Arr[] = str.split(" ");

        System.out.println("Number of words are : "+Arr.length);

        int iMax = 0;
        int MaxIndex = 0;
        System.out.println("Words and its length from the string are : ");
        for(int i = 0; i < Arr.length; i++)
        {
            if(iMax < Arr[i].length())
            {
                iMax = Arr[i].length();
                MaxIndex = i;
            }
        }
        System.out.println("Largest word from String is : "+Arr[MaxIndex]+ " with the length : "+iMax);

    }// end of main
}//end of class
