import java.io.*;
import java.util.*;

class Program427
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String str = sobj.nextLine();

        String Arr[] = str.split(" ");

        System.out.println("Number of words are : "+Arr.length);

        System.out.println("Words and its length from the string are : ");
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i] + " Length is : "+Arr[i].length());
        }

    }// end of main
}//end of class
