#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<string.h>

int OpenFile(char Name[])
{
    int fd = 0;
    fd = open(Name,O_RDWR);
    return fd;
}

void WriteFile(int fd, char Data[])
{
    int Length = strlen(Data);
    lseek(fd,0,SEEK_END);
    write(fd,Data,Length);
}



int main()
{
    char Fname[20];
    int fd = 0;

    char wData[50];

    printf("Enter the file name that you want to open : ");
    scanf("%s",Fname);

    printf("Enter data you want to write : \n");
    scanf(" %[^'\n']s",wData);

    fd = OpenFile(Fname);

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }

    WriteFile(fd, wData);

    close(fd);

    return 0;
}