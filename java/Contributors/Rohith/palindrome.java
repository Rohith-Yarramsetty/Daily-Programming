// Verify whether a given number is palindrome or not
// Print the numbers between x & y which are palindromes
// Print the count of palindrome between x & y
// Print n no.of palindromes

// User have given a number  // 267
// Reverse the number        // 762
// verify whether the num you have entered & the num that was reversed are equal or not  // 267==762 -> False
// Print the given nunber is/isnot a palindrome

// User have to enter 2 values // x = 100 & y = 250
// loop between each number b/n x & y  // for(int i=x;i<y+1; i++)
// Reverse each and every number of i
// verify whether the num of I  that was reversed are equal or not  // 267==762 -> False
// Print them if they satisfy the palindrome logic

// User have to enter 2 values // x = 100 & y = 250
// loop between each number b/n x & y  // for(int i=x;i<y+1; i++)
// Reverse each and every number of i
// verify whether the num of I  that was reversed are equal or not  // 267==762 -> False
// Count them if they satisfy the palindrome logic
// After the loop, print the final count

// User have given a number  // num = 2
// loopstart = 10
// countOfPalindromes = 0
// You have to start your loop from 10 --> while(count != num)
// reverse the loopstart
// check if the loopstart is palindrome or not
// If loopstart is palindrome  ==> print(loopstart)
//                                  countodPalindrome++
// loopStart++

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        verifyGivenNumberIsPalindrome();
    }

    static void verifyGivenNumberIsPalindrome() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int numToBeReversed = getUserInput.nextInt();
        int reversedNum = reverseNumber(numToBeReversed);

        if(numToBeReversed==reversedNum)
            System.out.println(numToBeReversed + " is a palindrome");
        else 
            System.out.println(numToBeReversed+" is not a palindrome");
    }

    static void printThePalindromesBetweenRange() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int startRange = getUserInput.nextInt();
        System.out.print("Enter the end range: ");
        int endrange = getUserInput.nextInt();

        int numCopy, lastDigit, reversedNum;
        for(int i = startRange; i<=endrange; i++) {
            numCopy = i;
            lastDigit = 0;
            reversedNum = 0;
            while (numCopy>0) {
                lastDigit = numCopy%10;
                reversedNum = reversedNum*10;
                reversedNum+=lastDigit;
                numCopy = numCopy/10;
            }

            if(reversedNum==i) {
                System.out.println(i);
            }
        }
    }

    static void printThePalindromesBetweenRangeUsingReverseMethod() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int startRange = getUserInput.nextInt();
        System.out.print("Enter the end range: ");
        int endrange = getUserInput.nextInt();

        int numCopy, lastDigit, reversedNum;
        for(int i = startRange; i<=endrange; i++) {
            reversedNum = reverseNumber(i);

            if(reversedNum==i) {
                System.out.println(i);
            }
        }
    }

    static void printTheCountOfPalindromesBetweenRange() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int startRange = getUserInput.nextInt();
        System.out.print("Enter the end range: ");
        int endrange = getUserInput.nextInt();

        int numCopy, lastDigit, reversedNum, count = 0;
        for(int i=startRange; i<=endrange; i++) {
            numCopy = i;
            lastDigit = 0;
            reversedNum = 0;
            while (numCopy>0) {
                lastDigit = numCopy%10;
                reversedNum = reversedNum*10;
                reversedNum = reversedNum + lastDigit;
                numCopy = numCopy / 10;
            }

            if(reversedNum == i) {
                count+=1;
            }
        }
        System.out.println("The palindromes count between "+startRange+" and "+endrange+ " is "+count);
    }

    static void printTheCountOfPalindromesBetweenRangeUsingReverseMethod() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int startRange = getUserInput.nextInt();
        System.out.print("Enter the end range: ");
        int endrange = getUserInput.nextInt();

        int reversedNum, count = 0;
        for(int i=startRange; i<=endrange; i++) {
            reversedNum = reverseNumber(i);
            if(reversedNum == i) {
                count++;
            }
        }
        System.out.println("The palindromes count between "+startRange+" and "+endrange+ " is "+count);
    }

    static void printTheDesiredNoOfPalindrome() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the desired number to get palindromes: ");
        int desiredCount = getUserInput.nextInt();

        int numCopy, lastDigit, reversedNum, actualCount = 0, startNumber = 1;
        while(desiredCount != actualCount) {
            lastDigit = 0;
            reversedNum = 0;
            numCopy = startNumber;

            while(numCopy>0) {
                lastDigit = numCopy % 10;
                reversedNum*=10;
                reversedNum+=lastDigit;
                numCopy/=10;
            }

            if(reversedNum == startNumber) {
                System.out.print(startNumber+" ");
                actualCount+=1;
            }
            startNumber++;
        }
    }

    static void printTheDesiredNoOfPalindromeUsingReverseMethod() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the desired number to get palindromes: ");
        int desiredCount = getUserInput.nextInt();

        int actualCount = 0, startNumber = 1, reversedNum;
        while(desiredCount != actualCount) {
            reversedNum = reverseNumber(startNumber);

            if(reversedNum == startNumber) {
                System.out.print(startNumber+" ");
                actualCount+=1;
            }
            startNumber++;
        }
    }

    static int reverseNumber(int num) {
        int lastDigit = 0;
        int reversedNumber = 0;

        while(num>0) {
            lastDigit = num % 10;
            reversedNumber = reversedNumber*10;
            reversedNumber = reversedNumber + lastDigit;
            num = num / 10;
        }
        return reversedNumber;
    }
}
