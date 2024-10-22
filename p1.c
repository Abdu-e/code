#include <stdio.h>
#include <pthread.h>

float shared_var = 64.0;
pthread_mutex_t mutex;

void *incr(void *arg)
{
    pthread_mutex_lock(&mutex);
    shared_var++;
    printf("Incremented: %.2f\n", shared_var);
    pthread_mutex_unlock(&mutex);
    
    return NULL;
}
void *decr(void *arg)
{
    pthread_mutex_lock(&mutex);
    shared_var--;
    printf("Decremented: %.2f\n", shared_var);
    pthread_mutex_unlock(&mutex);
    
    return NULL;
}
void *double_var(void *arg)
{
    pthread_mutex_lock(&mutex);
    shared_var *= 2;
    printf("Doubled: %.2f\n", shared_var);
    pthread_mutex_unlock(&mutex);
    
    return NULL;
}
void *halve_var(void *arg)
{
    pthread_mutex_lock(&mutex);
    shared_var /= 2;
    printf("Halved: %.2f\n", shared_var);
    pthread_mutex_unlock(&mutex);
    
    return NULL;
}

int main()
{
    pthread_t tid[4];
    pthread_mutex_init(&mutex, NULL);

    pthread_create(&tid[0], NULL, incr, NULL);
    pthread_create(&tid[1], NULL, decr, NULL);
    pthread_create(&tid[2], NULL, double_var, NULL);
    pthread_create(&tid[3], NULL, halve_var, NULL);

    for (int i = 0; i < 4; i++)
    {
      pthread_join(tid[i], NULL);
    }
    pthread_mutex_destroy(&mutex);
    
    return 0;
}