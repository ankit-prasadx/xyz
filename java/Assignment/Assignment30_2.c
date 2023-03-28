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
void InsertLast(PPNODE First, int no)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));
    temp = *First;

    newn->Data = no;
    newn->Next = NULL;

    if(*First == NULL)
    {
        *First = newn;
    }
    else
    {
        while(temp->Next != NULL)
        {
            temp = temp -> Next;
        }
        temp->Next = newn;
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

void Reverse(PNODE Head)
{
    int iNo = 0;
    int iSum = 0;
    int iDigit = 0;
    int temp = 0;

    while(Head != NULL)
    {
        iDigit = 0;
        iSum = 0;
        iNo = Head->Data;
        temp = Head->Data;

        while (iNo > 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iSum = (iSum * 10) + iDigit;
        }
        if(iSum == temp)
        {
            printf("%d\t",iSum);
        }
        Head = Head->Next;
    }
    printf("\n");
}

int main()
{
    PNODE Head = NULL;

    InsertLast(&Head, 11);
    InsertLast(&Head, 28);
    InsertLast(&Head, 17);
    InsertLast(&Head, 414);
    InsertLast(&Head, 6);
    InsertLast(&Head, 89);

    Display(Head);
    Reverse(Head);

    return 0;
}