//Write C++ program to Check whether a number can be represented as difference of two squares 

//Given a number N, the task is to check if this number can be represented as the difference of two perfect squares or not.

//input: N = 3
//Output: Yes
//Explanation:
//2^2 – 1^1 = 3

#include <bits/stdc++.h>
using namespace std;
bool difSquare(int n)
{
if (n % 4 != 2)
{
return true;
}
    return false;
}
int main()
{
int n;
cout<<"N = ";
cin>>n;
if (difSquare(n))
{
cout << "Yes\n";
}
else {
cout << "No\n";
}
return 0;
} 
