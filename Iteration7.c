#include<stdio.h>

int main()
{
    int i = 0;

    i = 1;                      //  1

    do
    {
        printf("%d\n",i);       // 4
        i++;                    // 3
    }while( i <= 5);             // 2

    return 0;
}