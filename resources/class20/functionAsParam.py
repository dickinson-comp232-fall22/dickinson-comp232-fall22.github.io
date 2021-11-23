def add5(x):
    return x + 5

def multBy3IfPositive(x):
    if x > 0:
        return 3 * x
    else:
        return 0

def applyToSeven(f):
    return f(7)

def applyToMinusNine(f):
    return f(-9)

print('applyToSeven(add5) yields', applyToSeven(add5))
print('applyToSeven(multBy3IfPositive) yields', applyToSeven(multBy3IfPositive))
print('applyToMinusNine(add5) yields', applyToMinusNine(add5))
print('applyToMinusNine(multBy3IfPositive) yields', applyToMinusNine(multBy3IfPositive))


import math

print(math.sqrt(5)) # anonymous

x = 5
print(math.sqrt(x)) # named

print(applyToSeven(add5))
print(applyToSeven(lambda x: x+5))

x = applyToSeven(lambda potato: potato%4 + potato*potato)
print(x)
x = applyToMinusNine(lambda oak: math.factorial(oak+12) * oak)
print(x)
