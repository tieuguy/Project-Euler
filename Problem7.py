'''
Created on 2013-06-27

@author: tieuph
10001st prime
Problem 7
Published on Friday, 28th December 2001, 06:00 pm; 
Solved by 155374
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
we can see that the 6th prime is 13.

What is the 10 001st prime number?

'''
import math

def prime(n):
    for x in range(2, int(math.floor(math.sqrt(n))+1)):
        if(n % x == 0):
            return False
    return True

def whichPrime(n):
    sequence = 0
    counter = 2
    while(True):
        if(prime(counter)):
            sequence += 1
            if(sequence == n):
                break
        counter += 1
    return counter

print whichPrime(10001)
