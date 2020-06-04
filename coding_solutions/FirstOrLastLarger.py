#Problem statement:
#Take a list of length 3 containing integers, find out which is larger, first or last one and set all the elements in the list to be that value. Print the updated list
#eg:
#1)Input - Given list: [1, 2, 3]
#Output- [3,3,3]
#2)Input - Given list: [2, 11, 3]
#Output- [3,3,3]


a=[]
b=[]
n=int(input())
for i in range(n):
    v=int(input())
    a.append(v)
if (a[0]>a[-1]):
    b=[a[0]]*n
else:
    b=[a[-1]]*n
print(b)
