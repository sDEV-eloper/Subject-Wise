#include<stdio.h>
#include<math.h>
double F(double x)
{//our function
    return ((x)*(x)-5);
}
double Fd(double x)
{//function's differentiation
    return (2*(x));
}
int main()
{
    double x0,h,err,root,x1;
    int miter,iter;
    printf("Enter the first approximation ,the max error and the maximum number of iterations\n");
    scanf("%lf%lf%d",&x0,&err,&miter);
    iter=1;
    while(iter<=miter)
    {
        h=F(x0)/Fd(x0);
        x1=x0-h;
        printf("The approximation's value after %d iteration is %.12lf\n",iter,x1);
        if(fabs(h)<err)
        {
            root=x1;
            break;
        }
        else
        x0=x1;
        iter++;
    }
    if(root==x1)
    {
        printf("The root is: %.12lf\n",root);
        double fncvalue = F(root);
        printf("Value of F(root) is: %.12lf",fncvalue);
    }
    else
    printf("The unsufficent number of iteration");
    getch();
}