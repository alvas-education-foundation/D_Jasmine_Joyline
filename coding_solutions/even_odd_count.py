#Python Program to count even and odd numbers 


#Write a Python program to count the number of even and odd numbers from a series of numbers.
#Numbers are = (1, 2, 3, 4, 5, 6, 7, 8, 9)
#Output:
#Number of even numbers : 5
#Number of odd numbers : 4

n=int(input())
l=[]
for i in range(n):
    v=int(input())
    l.append(v)
oddcount=0
evencount=0
for i in l:
    if (i%2==0):
        evencount+=1
    else:
        oddcount+=1
print("Number of even numbers : ",evencount)
print("Number of odd numbers : ",oddcount)
