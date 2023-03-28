#include<stdio.h>

int StrLen(char *str)
{
    static int iLen = 0;

    if(*str != '\0')
    {
        iLen++;
        str++;
        StrLen(str);
    }
    return iLen;
}

int main()
{
    int iRet = 0;
    char arr[20];

    printf("Enter string : ");
    scanf("%s",arr);

    iRet = StrLen(arr);

    printf("%d",iRet);

    return 0;
}