#include<stdio.h>
#include<math.h>
float f(float x){
    return x*x*x-2*x -5;
}
float bisect(float a,float b){
    return (a+b)/2;
}

int main(){
    int maxItr,i=1;
    float a,b,x;
    printf("Enter max Iteration:\n");
    scanf("%d",&maxItr);

    do{
        printf("Enter value of a,b:\n");
            scanf("%f%f",&a,&b);

            if(f(a)*f(b)>0)
            {
            printf("roots are invalid");
            continue;
            }
            else{
                printf("\nroots lie btw %f and %f:",a,b);
                break;
            }

    }
    while(1);

    while(i<=maxItr){
        x=bisect(a,b);
        if(f(x)*f(a)<0)
        b=x;
        else if(f(x)*f(b)<0)
        a=x;
        printf("Iterations: %d  Roots: %f\n",i,x);
        i++;
    }
    printf(" total Iterations: %d  Roots: %f\n",--i,x);
        

} 