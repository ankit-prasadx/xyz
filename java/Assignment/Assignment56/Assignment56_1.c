#include<stdio.h>

int WhiteSpace(char *str)
{
    static int iCnt = 0;

    if(*str != '\0')
    {
        if(*str == ' ')
        {
            iCnt++;
        }
        str++;
        WhiteSpace(str);
    }
    return iCnt;
}

int main()
{
    int iRet = 0;
    char arr[20];

    printf("Enter string : ");
    scanf("%[^'\n']s",arr);

    iRet = WhiteSpace(arr);

    printf("%d",iRet);

    return 0;
}