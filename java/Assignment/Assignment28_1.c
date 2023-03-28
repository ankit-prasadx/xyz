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

void InsertFirst(PPNODE Head, int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->Next = NULL;
    newn->Data = no;

    if(*Head == NULL)
    {
        *Head = newn;
    }
    else
    {
        newn -> Next = *Head;
        *Head = newn;
    }
}

int SearchFirstOcc(PNODE Head, int no)
{
    int iCnt = 1;
    while(Head != NULL)
    {
        if(Head->Data == no)
        {
            break;
        }
        iCnt++;
        Head = Head->Next;
    }
    if(Head == NULL)
    {
        return -1;
    }
    else
    {
        return iCnt;
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

int main()
{
    PNODE First = NULL;
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter element to search : ");
    scanf("%d",&iValue);

    InsertFirst(&First, 70);
    InsertFirst(&First, 30);
    InsertFirst(&First, 50);
    InsertFirst(&First, 40);
    InsertFirst(&First, 30);
    InsertFirst(&First, 20);
    InsertFirst(&First, 10);

    Display(First);

    iRet = SearchFirstOcc(First,iValue);
    if(iRet == -1)
    {
        printf("Entered Element is not Present in List\n");
    }
    else
    {
        printf("%d First Occured at position : %d\n",iValue,iRet);
    }

    return 0;
}