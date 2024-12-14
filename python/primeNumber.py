# Verify if a constant num is prime or not
numToCheck = 5

for i in range(2, numToCheck):
    if(numToCheck % i == 0):
        print(str(numToCheck) + " is not prime")
        break
    else:
        print(str(numToCheck)+" is prime")

# Verify if a number given by the user is prime
numToCheck = input("Enter a number: ")
numToCheck = int(numToCheck)

for i in range(2, numToCheck):
    if(numToCheck % i == 0):
        print(str(numToCheck) + " is not prime")
        break

# Verify if a number given by the user is prime through flag
numToCheck = input("Enter a number: ")
numToCheck = int(numToCheck)
isPrime = True

for i in range(2, numToCheck):
    if(numToCheck % i == 0):
        isPrime = False
        break

if(isPrime):
    print(str(numToCheck)+" is prime")
else:
    print(str(numToCheck)+" is not prime")


#  Verify the prime numbers in a range
startRange = input("Start: ")
endRange = input("End: ")

startRange = int(startRange)
endRange = int(endRange)

for numToCheck in range(startRange, endRange):
    isPrime = True
    for i in range(2, numToCheck):
        if(numToCheck % i == 0):
            isPrime = False
            break

    if(isPrime):
        print(str(numToCheck)+" is prime")

# Print the count of prime numbers in a range
startRange = input("Start: ")
endRange = input("End: ")

startRange = int(startRange)
endRange = int(endRange)
primeNumbersCount = 0

for numToCheck in range(startRange, endRange):
    isPrime = True
    for i in range(2, numToCheck):
        if(numToCheck % i == 0):
            isPrime = False
            break

    if(isPrime):
        primeNumbersCount = primeNumbersCount + 1

print(primeNumbersCount)
print("There are "+str(primeNumbersCount)+" prime numbers between "+str(startRange)+" and "+str(endRange))

# Print the desired number of prime numbers in a range
startRange = input("Start: ")
endRange = input("End: ")
primeNumbersCount = input("Prime numbers count: ")

startRange = int(startRange)
endRange = int(endRange)
primeNumbersCount = int(primeNumbersCount)

for numToCheck in range(startRange, endRange):
    isPrime = True
    for i in range(2, numToCheck):
        if(numToCheck % i == 0):
            isPrime = False
            break

    if(isPrime):
        primeNumbersCount = primeNumbersCount - 1

    if(primeNumbersCount == 0):
        print(numToCheck)
        break