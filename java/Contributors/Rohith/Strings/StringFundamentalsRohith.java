// Write a program to take a string from the user & print it
// Write a program to print the length of a String
// Write a program to print a whole string one by one
// Write a program to convert a String into an array of characters
// Write a program to reverse a string(with & without using predefined methods)
// Write a program to print a string by eliminating the user-given character
// Write a program to split a string on the basis of user given character


package Strings;

import java.util.Scanner;

public class StringFundamentalsRohith {
    public static void main(String[] args) {
        printStringLength();
    }

    public static void printString() {
        Scanner getUserInput = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String name = getUserInput.next();

        System.out.print("The output is: " + name);
    }

    public static void printStringLength() {
        Scanner getUserInput = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String name = getUserInput.next();

        System.out.println("The length of given string is: " + name.length());
    }

    public static void printStringOneByOne() {
        Scanner getUserInput = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String text = getUserInput.next();

        System.out.println("The characters of the string are: ");
        for(int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }

    public static void convertStringIntoArrayOfCharsAndPrint() {
        Scanner getUserInput = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String text = getUserInput.next();

        char breakdownText[] = new char[text.length()];

        for(int i = 0; i < text.length(); i++) {
            breakdownText[i] = text.charAt(i);
        }

        System.out.print("The array of characters values are: ");
        for (int i = 0; i < breakdownText.length; i++) {
            System.out.print(breakdownText[i] + " ");
        }
    }

}

