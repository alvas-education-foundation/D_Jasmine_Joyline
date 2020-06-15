# Python3 implementation of the above approach 

# Function to print the subsets whose 
# sum is equal to the given target K
def sumSubsets(sets, n, target) : 
 x = [0]*len(sets); 
 j = len(sets) - 1; 
 while (n > 0) : 
  x[j] = n % 2; 
  n = n // 2; 
  j -= 1; 
	
 sum = 0; 
 for i in range(len(sets)) : 
  if (x[i] == 1) : 
   sum += sets[i];
 if (sum == target) : 
   print("{",end="");
   for i in range(len(sets)) : 
    if (x[i] == 1) :
        print(sets[i],end= ", "); 
   print("}, ",end=""); 

# Function to find the subsets with sum K 
def findSubsets(arr, K) : 
 x = pow(2, len(arr));
 for i in range(1, x) :
     sumSubsets(arr, i, K); 


#main
arr = [ 5, 10, 12, 13, 15, 18 ]; 
K = 30; 
findSubsets(arr, K); 

