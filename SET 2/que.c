#include <stdio.h>

int main(){
    int a = 5;
    int *p = &a;
    int **q = &p;
    printf("%d\n", *(*q + 1));
    return 0;
}