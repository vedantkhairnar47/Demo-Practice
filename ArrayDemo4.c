#include<stdio.h>

int main()
{
    int Arr[4] = {10,20,30,40};
    
    int Brr[] = {10,20,30,40};
    
    int Crr[4];
    Crr[0] = 10;
    Crr[1] = 20;
    Crr[2] = 30;
    Crr[3] = 40;
    
    int Drr[6] = {10,20,30,40};

    printf("%d\n",Arr[0]);
    printf("%d\n",Brr[0]);
    printf("%d\n",Crr[0]);
    printf("%d\n",Drr[0]);
    
    printf("%d\n",Drr[4]);
    printf("%d\n",Drr[5]);
    
    Drr[4] = 50;
    Drr[5] = 60;
    
    printf("%d\n",Drr[4]);
    printf("%d\n",Drr[5]);
    
    return 0;
}