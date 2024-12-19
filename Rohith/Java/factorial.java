// The code for the day is factorial.
// Program-1: Find factorial of the given number
// User input=5
// Execution=5*4*3*2*1
// Output=The factorial for 5 is 120

// Program-2: find factorial of the numbers between 1 and user given number
// User Input = 4
// Execution= 
// 4*3*2*1
// 3*2*1
// 2*1
// 1

// Output=
// The factorial of 1 is 1
// The factorial of 2 is 2
// The factorial of 3 is 6
// The factorial of 4 is 24

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        findFactorialBetweenTheNumbers();
    }


    static void findFactorialOfGivenNumber() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the number to check the factorial: ");
        int number = getUserInput.nextInt();

        int startNumber = number, factorial = 1;
        while(startNumber > 0) {
            factorial = factorial*startNumber;
            startNumber--;
        }
        System.out.println("The Factorial of "+number+" is: "+ factorial);
    }

    static void findFactorialBetweenTheNumbers() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the number to check the factorial: ");
        int number = getUserInput.nextInt();

        int prod;
        for(int i=1; i<=number; i++) {
            prod = 1;
            for(int j=1; j<=i; j++) {
                prod = prod * j;
            }

            System.out.println("The Factorial of "+i+" is "+ prod);
        }
    }
}

