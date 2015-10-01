'''
Created on 2013-07-02

@author: tieuph

Special Pythagorean triplet
Problem 9
Published on Friday, 25th January 2002, 06:00 pm; 
Solved by 137187

A Pythagorean triplet is a set of three natural numbers, a < b < c, 
for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which 
a + b + c = 1000.
Find the product abc.
'''
for a in range(1, 500):
    for b in range(2, 499):
        c = 1000 - a - b
        if(a * a + b * b == c * c):
            print (a * b * c)
