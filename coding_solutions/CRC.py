#Write a Python program to perform Cyclic Redundancy Check 

#CRC uses Generator Polynomial which is available on both sender and receiver side. An example generator polynomial is of the form like x3 + x + 1. This generator polynomial represents key 1011. Another example is x2 + 1 that represents key 101.
#Data word to be sent - 100100
#Key - 1101 [ Or generator polynomial x3 + x2 + 1]


def xor(a, b): 

    result = []

    for i in range(1, len(b)):

        if a[i] == b[i]:

            result.append('0')

        else:

            result.append('1')

 

    return ''.join(result)

def mod2div(divident, divisor): 

    pick = len(divisor)

    tmp = divident[0 : pick]

 

    while pick < len(divident):

 

        if tmp[0] == '1':

            tmp = xor(divisor, tmp) + divident[pick]

 

        else:

            tmp = xor('0'*pick, tmp) + divident[pick]

        pick += 1

    if tmp[0] == '1':

        tmp = xor(divisor, tmp)

    else:

        tmp = xor('0'*pick, tmp)

 

    checkword = tmp

    return checkword 

def encodeData(data, key):

 

    l_key = len(key)

    appended_data = data + '0'*(l_key-1)

    remainder = mod2div(appended_data, key)

    codeword = data + remainder

    print("Remainder : ", remainder)

    print("Encoded Data (Data + Remainder) : ",

          codeword)

data = "100100"

key = "1101"

encodeData(data, key) 
