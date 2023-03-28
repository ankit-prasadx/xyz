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

int CountWhiteSpace(char FName[])
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
            if((Data[iCnt] == ' '))
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

    printf("Enter File Name : ");
    scanf("%s",Fname);

    iRet = CountWhiteSpace(Fname);

    printf("Number of White Spaces are %d\n",iRet);

    return 0;
}