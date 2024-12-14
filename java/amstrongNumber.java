
import java.util.Scanner;


public class amstrongNumber {
    public static void main(String[] args) {
        verifyTheGivenNumberIsAmstrong();
    }

    static void verifyTheGivenNumberIsAmstrong() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int numToCheck = getUserInput.nextInt();

        int copyOfNumToCheck1 = numToCheck, copyOfNumToCheck2 = numToCheck;
        int numberLength = 0;

        while(copyOfNumToCheck2>0) {
            copyOfNumToCheck2/=10;
            numberLength++;
        }

        int totalSum = 0;
        while(copyOfNumToCheck1>0) {
            int product = 1;
            int lastDigit = copyOfNumToCheck1 % 10;

            for(int i=0; i<numberLength; i++) {
                product = product*lastDigit;
            }
            totalSum = totalSum + product;
            copyOfNumToCheck1/=10;
        }
        if(totalSum == numToCheck)
            System.out.println(numToCheck + " is an Amstrong Number");
    }

    static void printTheAmstrongNumbersBetweenRange() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int startRange = getUserInput.nextInt();
        System.out.print("Enter the end range: ");
        int endRange = getUserInput.nextInt();

        int amstrongNumbersCount = 0;
        for(int i = startRange; i<=endRange; i++) {
            int numToCheck = i;
            int copyOfNumToCheck1 = i;

            int numberLength = 0;
            while(copyOfNumToCheck1>0) {
                copyOfNumToCheck1/=10;
                numberLength++;
            }

            int totalSum = 0;
            while(numToCheck>0) {
                int product = 1;
                int lastDigit = numToCheck % 10;
                for(int j = 0; j<numberLength; j++) {
                    product = product * lastDigit;
                }
                totalSum = totalSum + product;
                numToCheck/=10;
            }

            if(i == totalSum) {
                System.out.print(i + " ");
                amstrongNumbersCount++;
            }
        }
        System.out.println();
        System.out.println("The count of Amstrong Numbers between " + startRange + " and " + endRange + " is: " + amstrongNumbersCount);
    }

    static void printDesiredNumberOfAmstrongNumbers() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the no.of Amstrong numbers required: ");
        int desiredNumber = getUserInput.nextInt();
        int amstrongNumbersCount = 0;
        int startingNumber = 1;
        while(desiredNumber!=amstrongNumbersCount) {
            int startNumberCopy1 = startingNumber;
            int startNumberCopy2 = startingNumber;
            int digitLength = 0;
            while(startNumberCopy2>0) {
                startNumberCopy2/=10;
                digitLength++;
            }

            int totalSum = 0;
            while(startNumberCopy1>0) {
                int product = 1;
                int lastDigit = startNumberCopy1 % 10;
                for(int i=0; i<digitLength; i++) {
                    product = product * lastDigit;
                }
                totalSum = totalSum + product;
                startNumberCopy1 /= 10;
            }
            if(totalSum == startingNumber) {
                System.out.print(startingNumber + " ");
                amstrongNumbersCount++;
            }
            startingNumber++;
        }
    }
}
