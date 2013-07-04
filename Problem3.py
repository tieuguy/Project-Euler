'''
Created on 2013-06-25

@author: tieuph
'''


'''
Largest prime factor
Problem 3
Published on Friday, 2nd November 2001, 06:00 pm; Solved by 181266
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
'''

if __name__ == '__main__':
    pass

import math


def prime(n):
    for x in range(2, int(math.floor(math.sqrt(n))+1)):
        if(n % x == 0):
            return False
    return True

answer = 0
number = 600851475143
counter = 2
while (counter < number/2):
    if((number % counter == 0) and prime(number / counter)):
        print (number / counter)
        break
    counter+=1
