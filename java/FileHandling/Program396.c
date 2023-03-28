#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<string.h>
// #include<unistd.h>   // for write function in MacOS

int main()
{
    char Fname[20];
    int fd = 0;
    int Length = 0;
    int Count = 0;
    int iCnt = 0;
    char Data[100];

    printf("Enter the file name that you want to open : ");
    scanf("%s",Fname);

    fd = open(Fname, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to Open file\n");
        return -1;
    }

    while((Length = read(fd,Data,sizeof(Data))) != 0)
    {
        for(iCnt = 0; iCnt < Length; iCnt++)
        {
            if((Data[iCnt] >= '0') && (Data[iCnt] <= '9'))
            {
                Count++;
            }
        }
    }

    printf("Number of Digits are : %d\n",Count);

    close(fd);

    return 0;
}