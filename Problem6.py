'''
Created on 2013-06-27

@author: tieuph
Sum square difference
Problem 6
Published on Friday, 14th December 2001, 06:00 pm; 
Solved by 182681
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten 
natural numbers and the square of the sum is 3025  385 = 2640.

Find the difference between the sum of the squares of the first 
one hundred natural numbers and the square of the sum.



'''
def sumOfSquares(n):
    sum = 0
    for x in range(1,n+1):
        sum += x * x
    return sum

def squareOfSums(n):
    sum = 0
    for x in range(1,n+1):
        sum += x
    return (sum * sum)

number = 100

print squareOfSums(number) - sumOfSquares(number)
