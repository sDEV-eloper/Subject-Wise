#include<stdio.h>
#include<math.h>
float fun(float x)
{
    return(x*x*x-x-1);

}
 void bisection(float *x,float a,float b, int *itr)
 {
     *x=(a+b)/2;
     ++(*itr);
     printf("Iteration no. %d X=%7.5f\n",*itr, *x);

 }
 int main(){
     int itr=0,maxmitr;
     float x,a,b,allerr,x1;
     printf("\nEnter values of a and b:");
     scanf("%f%f%f%d",&a,&b,&allerr,&maxmitr);
     bisection(&x,a,b,&itr);
     do
     {
         if(fun(a)*fun(x)<0)
         b=x;
         else
         a=x;
         bisection(&x1,a,b,&itr);
         if(fabs(x1-x)<allerr)
        {
            printf("After %d iteration,root=%6.4f\n",itr,x1);
        }
        x=x1;
     }
     while(itr<maxmitr);
     printf("The solution doest not converge or iteration are not satisfied");
     return 0;
 }