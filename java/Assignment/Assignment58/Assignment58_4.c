#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include<fcntl.h>

int OpenFile(char Name[])
{
    int fd = 0;
    fd = open(Name, O_RDONLY);
    return fd;
}

int CountChar(char FName[], char ch)
{
    int fd = 0;
    int Length = 0;
    int iCnt = 0;
    int Count = 0;
    char Data[100];

    fd = OpenFile(FName);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }

    while((Length = read(fd, Data, sizeof(Data))) != 0)
    {
        for(iCnt = 0; iCnt < Length; iCnt++)
        {
            if(Data[iCnt] == ch)
            {
                Count++;
            }
        }
    }

    close(fd);

    return Count;
}

int main()
{
    char Fname[20];
    int iRet = 0;
    char cValue = '\0';

    printf("Enter File Name : ");
    scanf("%s",Fname);

    printf("Enter the character : ");
    scanf(" %c",&cValue);

    iRet = CountChar(Fname, cValue);

    printf("Frequency of %c is  %d\n", cValue, iRet);

    return 0;
}