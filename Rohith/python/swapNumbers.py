def swapTwoNumbers():
    a,b = 10, 20
    b, a = a, b
    print(a,b)

def swapTwoNumbersUsingThirdVariable():
    a, b = 100, 150
    c = a
    a = b
    b = c
    print(a, b)

def swapTwoNumbersWithoutUsingThirdVariable():
    a, b = 50, 75
    a = a+b  #125
    b = a-b  #50
    a = a-b  #75
    print(a, b)

swapTwoNumbersWithoutUsingThirdVariable()



# ```
# Read value of a //10
# Read value of b //20--
# a = 10
# b = 20

# Declare a 3rd variable c 
# assign value of a to c //10--
# assign b value with c //20
# assign a value to b //10
# assign c value to a //20
# a = 20
# b = 10

# ```
# Read value of a //10
# Read value of b //20
# a = 10
# b = 20--

# Declare 3rd variable c 
# assign value of b --> c // c = 20
# assign value of a --> b // b = 10
# assign value of c --> a // a = 20

# print(a)  =>20
# print(b)  =>10
# ```