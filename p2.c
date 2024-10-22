//4270797
#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>
#include <unisted.h>
#include <sys/ipc.h>
#include <sys/time.h>
#include <sys/shm.h>

struct shared_d 
{
    long shared_v
};

void* func1(void* arg)
{
    //memory data
    struct shared_d *shared_d = (struct shared_d *)arg;

    //timer
    struct timeV start, end;
    getTOfDay (&start, NULL);

    long sum = 0;
    for (long i=0; i < 1000000000; i++)
    {
        sum += 1;
    }
    getTOfDay(&end, NULL);
    double dur = (double)(end,tv_s - start,tv_s)+(double)(total_end.tv_us - total_start.tv_us)/1000000;
    printf("Function 1 completed\n");
    pthread_exit(NULL);
}

void* func2(void* arg)
{
    long sum = 0;
    for (long i=0; i < 5000000; i++)
    {
        sum += 1;
    }
    printf("Function  2 completed\n");
    pthread_exit(NULL);
}

int main()
{
    pthread_t thread1, thread2;

    if (pthread_create(&thread1, NULL, func1, NULL))
    {
        fprintf(stderr, "Error creating thread (1)\n");
        return 1;
    }

    if (pthread_create(&thread2, NULL, func2, NULL))
    {
        fprintf(stderr, "Error creating thread (2)\n");
        return 1;
    }

    if (pthread_join(thread1, NULL))
    {
        fprintf(stderr, "Error joining thread (1)\n");
        return 1;
    }

    if (pthread_join(thread2, NULL))
    {
        fprintf(stderr, "Error joining thread (2)\n");
        return 1;
    }

    printf("Thread 1 and 2 have completed\n");

    return 0;
}