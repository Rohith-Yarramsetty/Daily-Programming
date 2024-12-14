# Write the programs for Even numbers:

def evenNumber():
    num = 112
    if(num%2==0):
        print(str(num)+ " is a even nummver")

def verifyGivenNumIsEven():
    num=int(input())
    if(num%2==0):
        print(str(num)+ " is a even nummber")

def printTheEvenNumbersInRange(startRange, endRange):
    for num in range(startRange, endRange+1):
        if(num%2==0):
            print(str(num)+" is even")

def printTheCountOfEvenNumbersInRange(startRange, endRange):
    countOfEvenNumbers = 0
    for num in range(startRange, endRange+1):
        if(num%2==0):
            countOfEvenNumbers+=1
    
    print(countOfEvenNumbers)

def printTheDesiredNumberOfEvenNumbers(desiredNumber):
    countOfEvenNumbers = 0
    startingNumber = 1
    while(desiredNumber>0):
        if(startingNumber%2==0):
            print(startingNumber, end=" ")
            countOfEvenNumbers+=1
        startingNumber+=1
        if(countOfEvenNumbers==desiredNumber):
            break


printTheDesiredNumberOfEvenNumbers(10)