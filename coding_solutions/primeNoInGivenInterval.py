# Write a python program to generate prime number in an interval u
#you just need to take two number as input from stdin and you need to find prime numbers between those two numbers and print them.

#Input Format
#You will be taking two numbers as an input from stdin one on each line respectively.

#Constraints 1 <= A, B <= 10^4

#Output Format
#You need to print the prime numbers one on each line

def prime(n1,n2):
 for i in range(n1,n2+1):
    if i>1:
      for j in range(2,i):
        if(i%j==0):
             break
      else:
        print(i)
#main
prime(900,1000)
