#include <stdio.h> 
  
// Function to find triangular number 
void triangular_series(int n) 
{ 
    for (int i = 1; i <= n; i++)  
        printf(" %d ", i*(i+1)/2); 
} 
  
// Driven Function 
int main() 
{ 
    int n; 
    printf("Enter the value of n: ");
    scanf("%d",&n);
    triangular_series(n); 
    return 0; 
} 
