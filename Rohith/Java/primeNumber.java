import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("-----This program is to check the Prime Numbers-----");
        System.out.println("          *****   Execition Started   *****         ");
        System.out.println(" ");

        printDesiredNoOfPrimeNumbers();

        System.out.println(" ");
        System.out.println("          *****   Execition Ended   *****         ");
    }

    static void isPrimeNumberOrNot() {
        Scanner getUserInput = new Scanner(System.in);

        System.out.print("Enter the number needs to be checked: ");
        int numToBeChecked = getUserInput.nextInt();

        int isDivisible = 0;

        for(int i = 2; i < numToBeChecked; i++) {
            if(numToBeChecked%i == 0) {
                isDivisible += 1;
                break;
            }
        }
        if(isDivisible == 0)
            System.out.println("--------" + numToBeChecked + " is a PRIME NUMBER --------");
        else
            System.out.println(numToBeChecked + " is a Composite Number");
    }

    static void primeNumbersAndTheirCountBetweenRange() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int startRange = getUserInput.nextInt();
        System.out.print("Enter the end range: ");
        int endRange = getUserInput.nextInt();

        int primeNumbersCount = 0;
        for(int i = startRange; i <= endRange; i++) {
            boolean isPrime = true;

            for(int j = 2; j < i; j++) {
                if(i % j == 0) {   // --> 5%2, 5%3, 5%4, 
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
                primeNumbersCount += 1;
            }
        }
        System.out.println();
        System.out.println("The prime numbers between " + startRange + " and " + endRange +" is: " + primeNumbersCount);
    }

    static void printDesiredNoOfPrimeNumbers() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the desired number: ");
        int desiredNumber = getUserInput.nextInt();           // 2

        int startRange = 2;                                   // 10
        int actualPrimeNumbersCount = 0;                      // 0

        while(desiredNumber != actualPrimeNumbersCount) {     //2==0
            boolean isPrime = true;
            for(int i = 2; i < startRange; i++) {
                if(startRange%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(startRange+" ");
                actualPrimeNumbersCount++;
            }
            startRange++;
        }
    }
}

