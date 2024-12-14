# Reverse a Number
def printTheUserGivenNumberByReversing():    # Given 123   321
    numberToBeReversed = int(input("Enter the Number: "))
    copyOfNumberToBeReversed = numberToBeReversed

    temporaryVariable = 0
    lastNum = 0
    while(copyOfNumberToBeReversed>0):
        lastNum = copyOfNumberToBeReversed%10  # this is used to retriev the last digit of the num
        temporaryVariable = temporaryVariable*10 + lastNum # 
        copyOfNumberToBeReversed//=10

    print(temporaryVariable)



printTheUserGivenNumberByReversing()


# # Given 123   321
# Read a value from the user - num   // 123
# Copy the value num - numCopy   - numCopy // 123
# Declare a temporary variable - tempNum // 0
# Declare another variable - lastNum // 0
# Division logic - 2 (1. quotient(//), 2. Reminder(%))       2)24(10   (%)  -  4
# `                                                            20      (/)  -  10
#                                                             ----
#                                                               4
# While given num is greater than 0                           10)123(12
#                                                                120
#                                                                ----
#                                                                3
# lastNum is overrided with last digit of the number  // last num = 3
# tempNum is multiplied with 10 and added with the lst num // 0+3 = 3  > tempnum = 3
# numCopy is divided by 10 (to get quotient)  // numCopy = 12

# --> while 12>0 // True
# lastNum is overrided with last digit of the number  // last num = 2     10)12(1
#                                                                            10
#                                                                           ----
#                                                                             2

# tempNum is multiplied with 10 and added with the lst num // 3*10+2 = 32  > tempnum = 32
# numCopy is divided by 10 (to get quotient)  // numCopy = 1

# --> while 1>0 // True
# lastNum is overrided with last digit of the number  // last num = 2     10)1(0
#                                                                            0
#                                                                           ----
#                                                                             1
# tempNum is multiplied with 10 and added with the lst num // 32*10+1 = 321  > tempnum = 321
# numCopy is divided by 10 (to get quotient)  // numCopy = 0


# tempNum = 321
# Given num = 123


# Number of numbers to be reversed:  5

# Enter a number: 123          // 321
# Enter a number: 124          // 421
# Enter a number: 125          // 521
# Enter a number: 126          // 621
# Enter a number: 12345        // 54321

# int num
# for (i=0, i<noOfNosToBeReversed, i++):
#     num = sc.nextInt();
#     numToBeReversed = 
#     copyOfNumToBeRever = numToBeReversed
#     TempVar = 0
#     lastDidit = =0
#     while(copyOfNumToBeRever>0)
#         ----
#         ----
#         ----
#     print(reversed)