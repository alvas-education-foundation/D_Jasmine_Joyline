#Write a menu program in Python to find Area-Circle, Circumference-Circle, Area- Square, Circumference-Square using functions with menu choice
def AreaCircle(r):
    return 3.14*r*r
def CircumferenceCircle(r):
    return 2*3.14*r

def AreaSquare(l):
    return l*l
def CircumferenceSquare(l):
    return 4*l



while True:
  print()
  print('-----MENU-----')
  print('1.Area of Circle')
  print('2.Circumference of Circle')
  print('3.Area of Square')
  print('4.Circumference of Square')
  print('5.exit')
  choice=int(input('Enter your choice '))
  print()
  if choice==1 :
      r=float(input("Enter Radius Of Circle: "))
      ac=AreaCircle(r)
      print("The area of circle is ")
      print(ac)
  if choice==2 :
      r=float(input("Enter Radius Of Circle: "))
      cc=CircumferenceCircle(r)
      print("Circumference Of Circle is: ",cc)
  if choice==3 :
      l=float(input('Enter length Of Square: '))
      As=AreaSquare(l)
      print("Area Of Square is: ",As)
  if choice==4 :
      l=float(input('Enter length Of Square: '))  
      cs=CircumferenceSquare(l)
      print("Circumference Of Square is: ",cs)
  elif choice==5:
      exit()
  
