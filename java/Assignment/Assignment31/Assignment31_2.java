import java.util.*;

class StringDemo
{
    public int CountSmall(String str)
    {
        int iCnt = 0;
        int sCount = 0;
        char cStr[] = str.toCharArray();

        for(iCnt = 0; iCnt < cStr.length; iCnt++)
        {
            if((cStr[iCnt] >= 'a') && (cStr[iCnt] <= 'z'))
            {
                sCount++;
            }
        }
        return sCount;
    }
}

class Assignment31_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        
        System.out.print("Please Enter String : ");
        String str = sobj.nextLine();

        StringDemo sdObj = new StringDemo();

        iRet = sdObj.CountSmall(str);

        System.out.println("Count of Small Characters is : "+iRet);

        sobj.close();
    }
}