'''
Created on 2013-06-25

@author: tieuph
'''

if __name__ == '__main__':
    pass

num1 = 1
num2 = 2
num3 = 3
sum = 2

while ((num1 + num2) < 4000000):
    num3 = num1 + num2
    if(num3 % 2 == 0):
        sum = sum + num3
    num1 = num2
    num2 = num3
print sum
