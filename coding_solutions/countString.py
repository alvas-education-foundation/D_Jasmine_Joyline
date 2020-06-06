l=[]
n=int(input('Enter value of n: '))
for i in range(n):
    s=input()
    l.append(s)
count=0
for i in l:
    if(i[0]==i[-1]):
        count+=1
print(count)
