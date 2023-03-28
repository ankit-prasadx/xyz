#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<string.h>

int OpenFile(char Name[])
{
    int fd = 0;
    fd = open(Name,O_RDONLY);
    return fd;
}

int SizeOfFile(int fd)
{
    int Length = 0;
    char Data[100];
    int iSize = 0;

    while((Length = read(fd,Data,sizeof(Data))) != 0)
    {
        iSize = iSize + Length;
    }

    return iSize;
}



int main()
{
    char Fname[20];
    int fd = 0;
    int iRet = 0;

    printf("Enter the file name that you want to open : ");
    scanf("%s",Fname);

    fd = OpenFile(Fname);

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }

    iRet = SizeOfFile(fd);

    printf("File size is %d bytes\n",iRet);

    close(fd);

    return 0;
}