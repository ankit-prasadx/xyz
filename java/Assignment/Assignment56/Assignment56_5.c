#include<stdio.h>

int Reverse(int iNo)
{
    static int iReverse = 0;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iReverse = (iReverse * 10) + iDigit;
        Reverse(iNo/10);
    }
    return iReverse;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Value : ");
    scanf("%d",&iValue);

    iRet = Reverse(iValue);

    printf("%d\n",iRet);

    return 0;
}