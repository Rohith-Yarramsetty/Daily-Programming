// Write a program to reverse the user given number
// Write a program to print the n numbers in reversed format

import java.util.*;

public class ReverseNum {
    public static void main(String[] args){
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = getUserInput.nextInt();
        reverseTheGivenCountOfNumbers(num);
    }

    static int printTheReversedNumber(int numToBeReversed) {
        int lastDigit = 0;
        int reversedNum = 0;
        int copyOfNumToBeReversed = numToBeReversed;
        while(numToBeReversed>0){
            lastDigit = numToBeReversed%10;
            reversedNum = reversedNum*10 + lastDigit;
            numToBeReversed/=10;
        }
        System.out.println("The reversed version of "+copyOfNumToBeReversed+" is "+reversedNum);
        return reversedNum;
    }

    static void reverseTheGivenCountOfNumbers(int noOfNumbersToBeReversed) {
        int num = 0;
        Scanner getUserInput = new Scanner(System.in);
        for(int i = 0; i<noOfNumbersToBeReversed; i++) {
            System.out.print("Enter the number to be reversed: ");
            num = getUserInput.nextInt();
            int numCopy = num;          // 121
            int lastDigit = 0;
            int reversedNum = 0;
            while(num>0){
                lastDigit = num%10;        // 1  2
                reversedNum = reversedNum*10 + lastDigit;  // 1  12
                num = num/10;            // 12   1
            }
            System.out.println("The reversed version of "+numCopy+" is "+reversedNum);
        }
    }
}
