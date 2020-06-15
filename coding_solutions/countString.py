#write a Python program to count the number of strings, provided string length is 2 or more and the first and last character are same from a given list of strings.
#Eg:
#Input:
#list1['hia', 'aba' , '363']
#Output:
#Number of strings with first and last cahracter is same: 2

l=[]
n=int(input('Enter value of n: '))
for i in range(n):
    s=input()
    l.append(s)
count=0
for i in l:
    if(i[0]==i[-1]):
        count+=1
print('Number of strings with first and last cahracter is same:',count)
