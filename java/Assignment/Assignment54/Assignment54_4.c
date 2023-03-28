#include<stdio.h>

void Display(int iNo)
{
    static char cValue = 'A';

    if(iNo > 0)
    {
        printf("%c\t",cValue);
        cValue++;
        Display(--iNo);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}