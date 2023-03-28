#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<string.h>
// #include<unistd.h>   // for write function in MacOS

/*

    O_RDONLY    -> Open for Reading Only
    O_WRONLY    -> Open for Writing Only
    O_RDWR      -> Open for Reading and Writing Both

*/


int main()
{
    char Fname[20];
    int fd = 0;
    char Data[100];
    int Length = 0;

    printf("Enter the file name that you want to open : ");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR | O_APPEND);

    if(fd == -1)
    {
        return -1;
    }
    printf("Enter the data that you want to enter in the file : \n");
    scanf(" %[^'\n']s",Data);

    Length = strlen(Data);

    // write(kashat, kay, kiti)
    write(fd,Data,Length);

    return 0;
}