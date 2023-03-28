import java.util.*;

class StringDemo
{
    public int CountCapital(String str)
    {
        int iCnt = 0;
        int cCount = 0;
        char cStr[] = str.toCharArray();

        for(iCnt = 0; iCnt < cStr.length; iCnt++)
        {
            if((cStr[iCnt] >= 'A') && (cStr[iCnt] <= 'Z'))
            {
                cCount++;
            }
        }
        return cCount;
    }
}

class Assignment31_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        
        System.out.print("Please Enter String : ");
        String str = sobj.nextLine();

        StringDemo sdObj = new StringDemo();

        iRet = sdObj.CountCapital(str);

        System.out.println("Count of Capital Characters is : "+iRet);

        sobj.close();
    }
}