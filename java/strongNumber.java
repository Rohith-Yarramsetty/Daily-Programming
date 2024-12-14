/*                       STRONG NUMBER                    */
// Find whether the user given number is strong number or not
// Find the strong numbers between a range & print them along with the final count
// Write  a program to print n strong numbers

//////////  Program   1   ////////////// 
// Id value is 5! = 120
// Assume value = 456
// 6! = 6*5*4*3*2*1 ==> 720
// 5! = 5*4*3*2*1   ==> 120
// 4! = 4*3*2*1     ==> 24
// 720+120+24       ==> 864
// 864 == 456       ==> False

// Assume value = 145
// 5! = 5*4*3*2*1   ==> 120
// 4! = 4*3*2*1     ==> 24
// 1! = 1           ==> 1
// 120+24+1         ==> 145
// 145 == 145       ==> True

// num = 5;
// prod = 1;
// for(int i = 1; i<=num; i++) {
// prod = prod*i;  // ==>120
// }

// print(prod) 120 

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        printTheStrongNumbersInGivenRange();
    }

    static void checkTheGivenNumberIsStrongNumber() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the digit to check: ");
        int numToCheck = getUserInput.nextInt();

        int sum = 0, lastDigit = 0, numCopy = numToCheck;
        while(numCopy>0) {
            lastDigit = numCopy % 10;

            int prod = 1;
            for(int i=1; i<=lastDigit; i++) {
                prod = prod * i;
            }
            sum = sum + prod;
            numCopy = numCopy / 10;
        }
        if(sum == numToCheck) 
            System.out.println(numToCheck + " is a Strong Number");
    }

    static void printTheStrongNumbersInGivenRange() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int startRange = getUserInput.nextInt();
        System.out.print("Enter the end range: ");
        int endRange = getUserInput.nextInt();
        
        int strongNumbersCount = 0;
        for(int i = startRange; i<=endRange; i++) {
            int numCopy = i;

            int totalSum = 0;
            while(numCopy>0) {
                int product = 1;
                int lastDigit = numCopy % 10;
                for(int j = 1; j<=lastDigit; j++) {
                    product = product * j;
                }
                totalSum = totalSum + product;
                numCopy /= 10;
            }
            if (totalSum == i) {
                System.out.print(i + " ");
                strongNumbersCount++;
            }
        }
        System.out.println();
        System.out.println("The total number of strong numbers between " + startRange + " and " + endRange + " is: " + strongNumbersCount);
    }
}








// UserGivenNumber = 145
// loop should run until the userGivenNum is !=0
// Get the last digit of the userGivenNum
// lastDigit 

