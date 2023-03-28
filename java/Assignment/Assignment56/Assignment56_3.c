#include<stdio.h>

int CountSmall(char *str)
{
    static int iCnt = 0;

    if(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
            iCnt++;
        }
        str++;
        CountSmall(str);
    }
    return iCnt;
}

int main()
{
    int iRet = 0;
    char arr[20];

    printf("Enter string : ");
    scanf("%s",arr);

    iRet = CountSmall(arr);

    printf("%d",iRet);

    return 0;
}