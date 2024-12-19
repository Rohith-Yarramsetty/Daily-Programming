package Arrays;

import java.util.Scanner;

public class DuplicatesCountInAnArray {
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Declare the Array size: ");
        int arraySize = getUserInput.nextInt();

        int actualArray[] = new int[arraySize];

        System.out.println("Enter " + arraySize + " numbers into the array: ");
        for(int index = 0; index<arraySize; index++) {
            actualArray[index] = getUserInput.nextInt();
        }

        int uniqueNumbers[] = new int[arraySize];
        uniqueNumbers[0] = actualArray[0];       
        int uniqueNumbersIndex = 1;              
        for(int i = 0; i < arraySize; i++) {     
            boolean foundInArrray = false;       
            for(int j = 0; j < uniqueNumbersIndex; j++) {
                if(actualArray[i]==uniqueNumbers[j]) {
                    foundInArrray = true;
                }
            }
            if(!foundInArrray) {
                uniqueNumbers[uniqueNumbersIndex] = actualArray[i];
                uniqueNumbersIndex++;
            }
        }
        System.out.println("Numbers of actual array are: ");
        printArrayNumbers(actualArray);
        System.out.println("Unique numbers of the array are: ");
        printArrayNumbers(uniqueNumbers);

        int numbersCount = 0;
        for(int i = 0; i<uniqueNumbersIndex; i++) {
            numbersCount = 0;
            for(int j = 0; j < actualArray.length; j++) {
                if(uniqueNumbers[i] == actualArray[j]) {
                    numbersCount++;
                }
            }
            System.out.println(uniqueNumbers[i] + " is repeated " + numbersCount + " times");
        }
    }

    static void printArrayNumbers(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

