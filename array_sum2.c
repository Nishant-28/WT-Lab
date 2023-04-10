#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

int main(){
    pthread_t t1, t2;
    pthread_create(&t1, NULL, add_first_half, NULL);
    pthread_create(&t2, NULL, add_second_half, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    printf("The Sum of all elements in the array is : %.2f\n" , sum);
    return 0;
}