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
    char FnameSrc[20];
    char FnameDest[20];
    int fdSource = 0;
    int fdDest = 0;
    int Length = 0;
    char Data[100];

    printf("Enter the file name which contains data : ");
    scanf("%s",FnameSrc);

    fdSource = open(FnameSrc, O_RDONLY);

    if(fdSource == -1)
    {
        printf("Unable to Open file\n");
        return -1;
    }

    printf("Enter the file name that you want to create : ");
    scanf("%s",FnameDest);

    fdDest = creat(FnameDest,0777);

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

    return 0;
}