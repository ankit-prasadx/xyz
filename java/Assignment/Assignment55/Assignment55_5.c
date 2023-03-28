#include<stdio.h>

int Mult(int iNo)
{
    static int iMult = 1;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit > 0)
        {
            iMult = iMult * iDigit;
        }
        Mult(iNo/10);
    }
    return iMult;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Value : ");
    scanf("%d",&iValue);

    iRet = Mult(iValue);

    printf("%d\n",iRet);

    return 0;
}