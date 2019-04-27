#include<stdio.h>
#include<stdlib.h>
void main()
{
    char ch;
    int n;
    do
    {
        printf("Enter your Number:");
        scanf("%d",&n);
        if(n%2)
            printf("Entered number is odd");
        else
            printf("Entered number is even");
        fflush(stdin);
        printf("\nDo you want to enter one more number(y/n):");
        scanf("%c",&ch);
    }while(toupper(ch)=='Y');
}
