#Python Program to print first and last element of a list
a=[]
n=int(input())
for i in range(0,n):
    v=int(input())
    a.append(v)
print("The list containing First and Last element ",a[::len(a)-1])
