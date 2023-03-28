#include<stdio.h>
#include<stdlib.h>

#pragma pack(1)
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

    newn->Data = no;
    newn->Next = NULL;

    if(*First == NULL)
    {
        *First = newn;
    }
    else
    {
        newn->Next = *First;
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

void Display(PNODE First)
{
    printf("Elements of Linked List are : \n");
    while(First != NULL)
    {
        printf("|%d|->",First->Data);
        First = First -> Next;
    }
    printf("NULL\n");
}

int AdditionEven(PNODE First)
{
    int iSum = 0;
    int iNo = 0;
    while(First != NULL)
    {
        iNo = First->Data;
        if ((iNo % 2) == 0)
        {
            iSum = iSum + iNo;
        }
        First = First -> Next;
    }
    return iSum;
}

int main()
{
    PNODE Head = NULL;
    int iRet = 0;

    InsertLast(&Head, 11);
    InsertLast(&Head, 20);
    InsertLast(&Head, 32);
    InsertLast(&Head, 41);

    Display(Head);

    iRet = AdditionEven(Head);
    printf("Addition of Even elements is : %d\n",iRet);

    return 0;
}