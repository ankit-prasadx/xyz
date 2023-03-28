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

void DisplayN(char FName[], int iSize)
{
    int fd = 0;
    int Length = 0;
    // char Data[100];
    char Data[iSize];

    fd = OpenFile(FName);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return;
    }

    // Length = read(fd,Data,iSize);
    // write(1,Data,Length);

    read(fd,Data,iSize);
    write(1,Data,iSize);

    close(fd);
}

int main()
{
    char Fname[20];
    int iValue = 0;

    printf("Enter File Name : ");
    scanf("%s",Fname);

    printf("Enter the number of characters : ");
    scanf("%d",&iValue);

    DisplayN(Fname, iValue);

    return 0;
}