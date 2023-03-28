import java.util.*;

class StringDemo
{
    private char[] toLowerX(String str)
    {
        int iCnt = 0;
        char cStr[] = str.toCharArray();
        for(iCnt = 0; iCnt < cStr.length; iCnt++)
        {
            if((cStr[iCnt] >= 'A') && (cStr[iCnt] <= 'Z'))
            {
                cStr[iCnt] = (char) (cStr[iCnt] + 32);
            }
        }
        return cStr;
    }
    public boolean ChkVowel(String str)
    {
        char cStr[] = toLowerX(str);
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 0; iCnt < cStr.length; iCnt++)
        {
            if((cStr[iCnt] == 'a') || (cStr[iCnt] == 'e') || (cStr[iCnt] == 'i') || (cStr[iCnt] == 'o') || (cStr[iCnt] == 'u'))
            {
                bFlag = true;
                break;
            }
        }
        return bFlag;
    }
}

class Assignment31_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        boolean bRet = false;
        
        System.out.print("Please Enter String : ");
        String str = sobj.nextLine();

        StringDemo sdObj = new StringDemo();

        bRet = sdObj.ChkVowel(str);

        System.out.println(bRet);

        sobj.close();
    }
}