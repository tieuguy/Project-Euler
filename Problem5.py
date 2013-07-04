'''
Created on 2013-06-27

@author: tieuph

Smallest multiple
Problem 5
Published on Friday, 30th November 2001, 06:00 pm; 
Solved by 180966
2520 is the smallest number that can be divided by each of the numbers
 from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by 
all of the numbers from 1 to 20?
'''

counter = 1
breaker = 0
while(True):
    y = 20 * counter
    breaker = 0
    for x in range(19,1,-1):
        if(y % x == 0):
            breaker+=1
    if(breaker == 18):    
        print y
        break
    counter+=1
