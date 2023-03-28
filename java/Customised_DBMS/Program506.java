import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Program506
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

    }
}
