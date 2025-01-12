// Palindrome check

package Strings;

import java.util.Scanner;

public class palindromeCheck {

    public static void main (String[] args) {
        Scanner getUserInput = new Scanner(System.in);

        System.out.print("Enter the value: ");
        String valueToBeChecked = getUserInput.next(); //31392
        int numbers[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean palindromeStatus, isNumber = false;

        for(int i : numbers) {
            if (valueToBeChecked.charAt(0)==numbers[i]) {
                isNumber = true;
                break;
            }
        }
        if(isNumber) {
            int num = Integer.parseInt(valueToBeChecked);
            palindromeStatus = checkTheNumberPalindrome(num);
        } else {
            palindromeStatus = checkTheStringPalindrome(valueToBeChecked);
        }
        printPalindromeCheck(palindromeStatus);
    }

    public static boolean checkTheStringPalindrome(String name) {
        String reversedString = "";
        boolean isEqual = false;

        for(int i = name.length()-1; i >= 0; i--) {
            reversedString = reversedString + name.charAt(i);
        }

        if(reversedString.equalsIgnoreCase(name)) {
            isEqual = true;
        }
        return isEqual;
    }
    
    public static boolean checkTheNumberPalindrome(int number) {   //121
        int numberCopy = number;
        int reverse = 0;
        boolean isEqual = false;

        while(numberCopy>0) {
            int lastDigit = numberCopy % 10;
            reverse = reverse * 10 + lastDigit;
            numberCopy/=10;
        }

        if(reverse == number) {
            isEqual = true;
        }
        return isEqual;
    }

    public static void printPalindromeCheck(boolean isPalindrome) {
        if(isPalindrome) {
            System.out.println("            <<<<<<<<<<<      Yes! It's a Palindrome     >>>>>>>>>>      ");
        } else {
            System.out.println("                       XXXXXXXXXX      Not a Palindrome     XXXXXXXXXX                   ");
        }
    }
}

// 121 ==> 121   273    ==> 372 XX
// SOS ==> SOS   Simple ==> elpimS XX