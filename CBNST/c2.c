#include<stdio.h>
#include<math.h>
#define f(x) cos(x)-3*x+1
#define g(x) (1+cos(x))/3
int main(){
    int step=1, n;
    float x0,x1,e;
    printf("Enter intial guess,tolerable error,maxiiteration:");
    scanf("%f%f%d",&x0,&e,&n);
    printf("\nstep\tx0..");
    do{
        x1=g(x0);
        printf("%d %f %f %f\n",step,x0,f(x0),x1,f(x1));
        step=step+1;
        if(step>n){
            printf("Not convergent");
        }
        x0=x1;
    }
    while(fabs(f(x1))>e);
    printf("Root is %f\n",x1);

}