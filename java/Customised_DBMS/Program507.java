import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Program507
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        String Arr[] = str.split(" ");


        HashMap <String, Integer> hobj = new HashMap<>();

        int Frequency = 0;

        for(String s : Arr)
        {
            if(hobj.containsKey(s))
            {
                Frequency = hobj.get(s);
                hobj.put(s, Frequency+1);
            }
            else
            {
                hobj.put(s, 1);
            }
        }

        System.out.println(hobj);
        
        Set <String> setobj = hobj.keySet();

        int iMax = 0;
        String sMax = " ";

        for(String value : setobj)
        {
            if(iMax < hobj.get(value))
            {
                iMax = hobj.get(value);
                sMax = value;
            }
        }

        System.out.println("maximum times occured word is : "+sMax+" with frequency "+iMax);

    }
}
