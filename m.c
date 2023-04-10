// Implement multiple , multilevel and combination of multiple and multilevel processes using fork system call.


#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>

int main()
{
    int i,j,k;
    pid_t pid1,pid2,pid3;
    pid1=fork();
    if(pid1==0)
    {
        printf("Child 1 process id is %d and parent process id is %d \n",getpid(),getppid());
        for(i=0;i<2;i++)
        {
            pid2=fork();
            if(pid2==0)
            {
                printf("Child 2 process id is %d and parent process id is %d \n",getpid(),getppid());
                for(j=0;j<2;j++)
                {
                    pid3=fork();
                    if(pid3==0)
                    {
                        printf("Child 3 process id is %d and parent process id is %d \n",getpid(),getppid());
                    }
                }
            }
        }

    }
    else
    {
        printf("Parent process id is %d \n",getpid());
    }
    return 0;
}