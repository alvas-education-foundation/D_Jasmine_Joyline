//Find the smallest positive integer value that cannot be represented as sum of any subset of a given array sorted in ascending order. 
class FindSmallestInteger  
{ 
    int findSmallest(int arr[], int n)  
    { 
        int res = 1; // Initialize result 
  
        
        for (int i = 0; i < n && arr[i] <= res; i++) 
            res = res + arr[i]; 
  
        return res; 
    } 
  
  
    public static void main(String[] args)  
    { 
        FindSmallestInteger small = new FindSmallestInteger(); 
        int arr1[] = {1, 3, 4, 5}; 
        int n1 = arr1.length; 
        System.out.println(small.findSmallest(arr1, n1)); 
  
    } 
} 
