'''
Created on 2013-07-03

@author: tieuph

Summation of primes
Problem 10
Published on Friday, 8th February 2002, 06:00 pm; 
Solved by 125264

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

'''
import math

def prime(n):
    for x in range(2, int(math.floor(math.sqrt(n))+1)):
        if(n % x == 0):
            return False
    return True


def sumOfPrime(number):
    sum = 0
    for x in range(2, number):
        if(prime(x)):
            sum += x
    return sum

print sumOfPrime(2000000)
