# Python Program to Reverse a Number
Number = int(input("Please Enter any Number: "))
Reverse = 0
while(Number > 0):
    Reminder = Number %10
    Reverse = (Reverse *10) + Reminder
    Number = Number //10
print("\nReverse of entered number is = %d" %Reverse)
