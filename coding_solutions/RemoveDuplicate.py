#Python program to remove duplicate elements
l=[1,2,2,8,8,8,3,4,4,5]
s=set(l)
r=list(s)
print(r)
for i in s: 
 print(i,end=" ")
