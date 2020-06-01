/*Given an array of positive integers. Write a C Program to find the leaders in
the array. 
Note: An element of array is leader if it is greater than or equal to all the elements to
its right side. Also, the rightmost element is always a leader.
Input:
The first line of input contains an integer T denoting the number of test cases. The
description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the
elements of the array.
Output:
Print all the leaders.
Constraints:
1 &lt;= T &lt;= 100
1 &lt;= N &lt;= 107
0 &lt;= Ai &lt;= 107
Example:
Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3
Explanation:
Testcase 3: All elements on the right of 7 (at index 0) are smaller than or equal to 7.
Also, all the elements of right side of 7 (at index 3) are smaller than 7. And, the last
element 3 is itself a leader since no elements are on its right. */
#include&lt;stdio.h&gt;
#include&lt;limits.h&gt;
void ArrayLeader(int arr[],int size);
void PrintArray(int arr[],int size);
int main(void)

{
int arr[] = {7,4,5,7,3};
int size = 5;
printf(&quot;\n\n....... Array Element .........\n\n&quot;);
PrintArray(arr,size);
printf(&quot;\n\n....... Leader in Array .......\n\n&quot;);
ArrayLeader(arr,size);
printf(&quot;\n\n...............................\n\n&quot;);
return 0;
}
void ArrayLeader(int arr[],int size)
{
int MaxTillNow,i;
MaxTillNow = INT_MIN;
for(i=size-1;i&gt;=0;--i)
{
if(arr[i] &gt; MaxTillNow)
{
printf(&quot;%d &quot;,arr[i]);
MaxTillNow = arr[i];
}
}
}
void PrintArray(int arr[],int size)
{
int i;
for(i=0;i&lt;size;++i)

printf(&quot;%d &quot;,arr[i]);
}
