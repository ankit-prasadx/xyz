#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>

/*

    O_RDONLY    -> Open for Reading Only
    O_WRONLY    -> Open for Writing Only
    O_RDWR      -> Open for Reading and Writing Both

*/


int main()
{
    char Fname[20];
    int fd = 0;

    printf("Enter the file name that you want to open : ");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR);

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("File is succesfully opened with FD %d\n",fd);
    }

    return 0;
}