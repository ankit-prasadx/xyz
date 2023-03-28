#include<stdio.h>
#include<stdlib.h>


struct node
{
    int Data;
    struct node * Next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void InsertFirst(PPNODE First, int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->Next = NULL;
    newn->Data = no;

    if(*First == NULL)
    {
        *First = newn;
    }
    else
    {
        newn -> Next = *First;
        *First = newn;
    }
}

void Display(PNODE Head)
{
    while(Head != NULL)
    {
        printf("|%d|->",Head->Data);
        Head = Head->Next;
    }
    printf("NULL\n");
}

void DisplayPerfect(PNODE Head)
{
    int iNo = 0;
    int iCnt = 0;
    int iSum = 0;

    while(Head != NULL)
    {
        iSum = 0;
        iCnt = 1;
        iNo = Head->Data;

        while (iCnt <= (iNo/2))
        {
            if(iNo % iCnt == 0)
            {
                iSum++;
            }
            iCnt++;
        }
        if(iSum == 1)
        {
            printf("%d\t",Head->Data);
        }

        Head = Head->Next;
    }
    printf("\n");
}

int main()
{
    PNODE Head = NULL;

    InsertFirst(&Head, 89);
    InsertFirst(&Head, 22);
    InsertFirst(&Head, 41);
    InsertFirst(&Head, 17);
    InsertFirst(&Head, 20);
    InsertFirst(&Head, 11);

    Display(Head);
    DisplayPerfect(Head);

    return 0;
}