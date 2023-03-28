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

int Count(PNODE First)
{
    int iCnt = 0;
    while(First != NULL)
    {
        iCnt++;
        First = First -> Next;
    }
    return iCnt;
}

int SecMaximum(PNODE First)
{
    int iMax = 0;
    int iSecMax = 0;
    int iNo = 0;
    int NodeCnt = 0;

    NodeCnt = Count(First);
    if(NodeCnt < 2)
    {
        return -1;
    }
    
    while(First != NULL)
    {
        iNo = First->Data;
        
        if(iNo > iMax)
        {
            iSecMax = iMax;
            iMax = iNo;
        }
        else if((iNo > iSecMax) && (iNo != iMax))
        {
            iSecMax = iNo;
        }
        First = First -> Next;
    }
    return iSecMax;
}

int main()
{
    PNODE Head = NULL;
    int iRet = 0;

    InsertLast(&Head, 110);
    InsertLast(&Head, 230);
    InsertLast(&Head, 320);
    InsertLast(&Head, 540);
    InsertLast(&Head, 550);
    InsertLast(&Head, 550);
    InsertLast(&Head, 510);

    Display(Head);

    iRet = SecMaximum(Head);
    printf("Second maximum element is : %d\n",iRet);

    return 0;
}