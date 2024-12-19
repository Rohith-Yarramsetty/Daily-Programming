package Arrays;

import java.util.Scanner;

public class evenNumbers {
    public static void main(String[] args) {

    }

    static void printEvenNumbersOfAnArray() {
        int[] arrayElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arrayElements.length; i++)
        {
            if(arrayElements[i]%2 == 0) System.out.println(arrayElements[i] + " ");
        }
    }

    static void inputElementsAndPrintEvenNumbersOfAnArray() {
        Scanner getUserInput = new Scanner(System.in);
        int arrayElements[] = new int[10];

        for(int index = 0; index < arrayElements.length; index++) {
            arrayElements[index] = getUserInput.nextInt();
        }
    }
}
