'''
Created on 2013-07-03

@author: tieuph

Longest Collatz sequence
Problem 14
Published on Friday, 5th April 2002, 12:00 pm; 
Solved by 89022
The following iterative sequence is defined for the set of positive 
integers:

n -> n/2 (n is even)
n -> 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the 
following sequence:

13  40  20  10  5  16  8  4  2  1
It can be seen that this sequence (starting at 13 and finishing at 1) 
contains 10 terms. Although it has not been proved yet 
(Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above 
one million.
'''
def longestCollatz(number):
    largestStart = 0
    largestTerms = 0
    current = 0
    for x in range(1, number + 1):
        current = collatzCount(x)
        if(current > largestTerms):
            largestStart = x
            largestTerms = current
    return largestStart
            
def collatzCount(number):
    counter = 1
    while(number != 1):
        if(number % 2 == 0):
            number = number / 2
            counter += 1
        else:
            number = number * 3 + 1
            counter += 1
    return counter    

print longestCollatz(1000000)
