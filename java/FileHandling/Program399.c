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


int main(int argc, char *argv[])
{
    int fdSource = 0;
    int fdDest = 0;
    int Length = 0;
    char Data[100];

    fdSource = open(argv[1], O_RDONLY);

    if(fdSource == -1)
    {
        printf("Unable to Open file\n");
        return -1;
    }

    fdDest = creat(argv[2],0777);

    if(fdDest == -1)
    {
        printf("Unable to create new file\n");
        return -1;
    }

    while((Length = read(fdSource,Data,sizeof(Data))) != 0)
    {
        write(fdDest,Data,Length);
    }

    close(fdSource);
    close(fdDest);
    
    printf("Data Successfully Copied...\n");

    return 0;
}