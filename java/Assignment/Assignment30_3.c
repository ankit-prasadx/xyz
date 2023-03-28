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

void DisplayProduct(PNODE Head)
{
    int iNo = 0;
    int iMult = 0;
    int iDigit = 0;

    while(Head != NULL)
    {
        iDigit = 0;
        iMult = 1;
        iNo = Head->Data;

        while (iNo > 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            
            if (iDigit == 0)    // To skip 0 digit
            {
                continue;
            }
            
            iMult = iMult * iDigit;
        }
        printf("%d\t",iMult);
        Head = Head->Next;
    }
    printf("\n");
}

int main()
{
    PNODE Head = NULL;

    InsertLast(&Head, 11);
    InsertLast(&Head, 20);
    InsertLast(&Head, 32);
    InsertLast(&Head, 41);
    InsertLast(&Head, 606);
    InsertLast(&Head, 8090);

    Display(Head);
    DisplayProduct(Head);

    return 0;
}