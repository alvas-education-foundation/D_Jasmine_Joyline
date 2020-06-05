#Python program to square each odd number in the list

#Description:
#Take a list of numbers and square each odd number in the list.
#Print output as comma separated sequence.
#eg:
#input list: [2,4,5,6,7,8,9]
#output: 25,49,81
a=[]
b=[]
n=int(input('Enter n '))
for i in range(n):
    l=int(input())
    a.append(l)
b=[x*x for x in a if x%2!=0]
print(b)
