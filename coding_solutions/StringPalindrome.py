#Write a python function that will take a string and checks whether it is a palindrome or not. Return If it a palindrome, print true else print false

#Eg: String is : 'aba'
#Output: True

def palindrome(string):
    str_rev=string[::-1]
    if string==str_rev :
        return True
    return False
#main
string=input("Enter the string to check if it is palindrome:a ")
print(palindrome(string))
