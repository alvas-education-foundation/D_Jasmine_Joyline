
#Write a python function that converts a string to all uppercase, provided it contains at least 2 uppercase characters in the first 4 characters. Else print the string as it is
#Input:
#Given string is : HeLlo
#Output string is: HELLO

#Input:
#Given string is : Hello
#Output string is: Hello





def to_uppercase(str1):
    num_upper = 0
    for letter in str1[:4]: 
        if letter.upper() == letter:
            num_upper += 1
    if num_upper >= 2:
        return str1.upper()
    return str1

str1=input("Given String is ")
print("Output String is ",to_uppercase(str1))
