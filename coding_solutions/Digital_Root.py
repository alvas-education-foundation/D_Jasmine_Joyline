#Description:
#A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
#digit_root(0)= 0

#digital_root(16)
#=> 1 + 6
#=> 7



def digital_root(num):
    sum=0
    for i in num:
        sum=sum+int(i)
    return sum
num=input('Enter the num ')
print(digital_root(num))
