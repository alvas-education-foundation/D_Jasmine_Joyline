#Python Program to check whether a given number is a fibonacci number or not
#Description:
#Input number : 8
#Output: 8 is a fibonacci number
#Input number : 4
#Output: 4 is not a fibonacci number

def checkfibonacci(n):
    a = 0
    b = 1
    if (n==a or n==b):
        return True5
    c = a+b;
    while c<=n :
        if(c == n):
            return True
        a = b
        b = c
        c = a + b
    return False
#main
n=int(input())
if checkfibonacci(n):
    print(n,"is a fibonacci number")
else:
    print(n,"is not a fibonacci number")
        
