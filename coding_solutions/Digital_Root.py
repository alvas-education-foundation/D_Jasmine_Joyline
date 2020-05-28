def digital_root(num):
    sum=0
    for i in num:
        sum=sum+int(i)
    return sum
num=input('Enter the num ')
print(digital_root(num))
