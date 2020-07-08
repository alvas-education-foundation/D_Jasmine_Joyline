d={0:'',1:'one',2:'two',3:'three',4:'four',5:'five',6:'six',7:'seven',8:'eight',9:'nine',10:'ten',11:'eleven',12:'twelve',13:'thirteen',14:'fouteen',15:'fifteen',16:'sixteen',17:'seventeen',18:'eighteen',19:'nineteen',20:'twenty',30:'thirty',40:'forty',50:'fifty',60:'sixty',70:'seventy',80:'eighty',90:'ninety',100:'hundred'}
num=int(input('Enter the 3 digit number'))
if num<=20:
    print(d[num])
elif num>20 and num<100:
    if num%10 ==0:
          print(d[num])
    else:
          print(d[num//10*10]+" "+d[num%10])
elif num>=100 and num<1000:
    if num%100==0:
          print(d[num//100]+" "+d[100])
    else:
          print(d[num//100]+" "+d[100]+" "+d[num%100//10*10]+" "+d[num%10])
