import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

class Program425
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String str = sobj.nextLine();

        String Arr[] = str.split(" ");

        System.out.println("Number of words are : "+Arr.length);

    }// end of main
}//end of class
