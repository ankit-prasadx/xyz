import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Program508
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        String Arr[] = str.split(" ");


        HashMap <String, Integer> hobj = new HashMap<>();

        int Frequency = 0;

        String output = "";



        for(String s : Arr)
        {
            if(hobj.containsKey(s))
            {
                Frequency = hobj.get(s);
                hobj.put(s, Frequency);
                output = output+"";
            }
            else
            {
                // System.out.println(s);
                hobj.put(s, 1);
                s = s+" ";
                output = output+s;
            }
        }

        System.out.println(output);

    }
}
