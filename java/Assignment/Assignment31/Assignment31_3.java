import java.util.*;

class StringDemo
{
    public int CountDiff(String str)
    {
        int iCnt = 0;
        int sCount = 0;
        int cCount = 0;
        char cStr[] = str.toCharArray();

        for(iCnt = 0; iCnt < cStr.length; iCnt++)
        {
            if((cStr[iCnt] >= 'a') && (cStr[iCnt] <= 'z'))
            {
                sCount++;
            }

            else if((cStr[iCnt] >= 'A') && (cStr[iCnt] <= 'Z'))
            {
                cCount++;
            }
        }
        return (sCount - cCount);
    }
}

class Assignment31_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        
        System.out.print("Please Enter String : ");
        String str = sobj.nextLine();

        StringDemo sdObj = new StringDemo();

        iRet = sdObj.CountDiff(str);

        System.out.println(iRet);

        sobj.close();
    }
}