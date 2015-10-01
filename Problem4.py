'''
Created on 2013-06-26

@author: tieuph


A palindromic number reads the same both ways. 
The largest palindrome made from the product 
of two 2-digit numbers is 9009 = 91  99.

Find the largest palindrome made from the product of two 3-digit numbers.
'''

#print (999*999)
#print (100*100)
#print (99*99)
'''
997799 - 990099

989989 - 980089
  |
90xx09

888888
'''
    
def isItPalindrome(num):
    digit1 = num % 10
    digit2 = ((num % 100) - digit1)/10
    digit3 = ((num % 1000) - (num % 100))/100
    digit4 = ((num % 10000) - (num % 1000))/1000
    digit5 = ((num % 100000) - (num % 10000))/10000
    digit6 = (num - (num % 100000))/100000
    if (digit1 == digit6) and (digit2 == digit5) and (digit3 == digit4):
        return True
    if digit6 == 0 and digit1 == digit5 and digit2 == digit4:
        return True
    return False

#print isItPalindrome(998001)
largest = 0
for x in range(999, 100, -1):
    for y in range(999, 100, -1):
        if (isItPalindrome(x * y)) and ((x * y) > largest):
            largest = (x * y)
print largest
