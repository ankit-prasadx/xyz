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
    int Length = 0;
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
        write(1,Data,Length);
    }

    close(fd);

    return 0;
}