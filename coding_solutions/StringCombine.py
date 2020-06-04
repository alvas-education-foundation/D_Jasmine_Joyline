#Python program to combine the strings (#55)
#Description:

#Take two strings, return a string of the form short+long+short, with the shorter string on the outsides and the longer string on the inside.
#The strings will not be the same length, but they may be empty (length 0).

#Eg:
#Str1= 'Hello'
#Str2= 'Hi'
#Combined_str('Hello', 'Hi') ='HiHelloHi'

def combine(str1,str2):
    if(len(str1)<len(str2)):
        return str1+str2+str1
    else:
        return str2+str1+str2
#main
str1=input('Enter string 1 : ')
str2=input('Enter string 2 : ')
print('The concatenated string is ',combine(str1,str2))
