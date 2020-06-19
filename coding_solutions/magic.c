#include <stdio.h>
#define max 1000000007
long long int magic(int n){
long long int pro=1;
long long res=0;
while(n){
pro=(pro*5)%max;
if(n&1)
res=(res+pro)%max;
n=n>>1;
}
return res;
}

int main()
{
int n,i;
printf("Enter n :");
scanf("%d",&n);
printf(" the magic numbers are: ");
for(i=0;i<n;i++)
{
printf("%d ",magic(i));
}
return 0;
}
