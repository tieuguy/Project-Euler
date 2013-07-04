'''
Created on 2013-06-25

@author: tieuph
'''
'''
if __name__ == '__main__':
    pass
threes = 0
fives = 0
fifteens = 0
counter = 1
while (3 * counter) < 1000:
    threes = threes + (3 * counter)
    counter = counter + 1
counter = 1
while (5 * counter) < 1000:
    fives = fives + (5 * counter)
    counter = counter + 1
counter = 1
while (15 * counter) < 1000:
    fifteens = fifteens + (15 * counter)
    counter = counter + 1
answer = threes + fives - fifteens
print answer
'''
def sumOfMultiples(n, limit):
    counter = 1
    sum = 0
    while ((n * counter) < limit):
        sum = sum + (n * counter)
        counter = counter + 1
    return sum

answer = sumOfMultiples(3, 1000) + sumOfMultiples(5, 1000) - sumOfMultiples(15, 1000)
print answer
