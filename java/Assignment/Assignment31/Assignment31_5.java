import java.util.*;

class StringDemo
{
    public void Reverse(String str)
    {
        char cStr[] = str.toCharArray();
        int iCnt = 0;

        for(iCnt = cStr.length-1; iCnt > -1; iCnt--)
        {
            System.out.print(cStr[iCnt]);
        }
        System.out.println();
    }
}

class Assignment31_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Please enter string : ");
        String str = sobj.nextLine();

        StringDemo sdObj = new StringDemo();

        sdObj.Reverse(str);

        sobj.close();
    }
}