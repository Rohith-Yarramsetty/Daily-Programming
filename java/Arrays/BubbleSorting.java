package Arrays;

import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        System.out.println();
        int lengthOfArray = getUserInput.nextInt();
        int arrayToBeSorted[] = new int[lengthOfArray];

        for(int index = 0; index<arrayToBeSorted.length; index++)
            arrayToBeSorted[index] = getUserInput.nextInt();

        System.out.print("Values before sorting: ");
        printElementsOfAnArray(arrayToBeSorted);

        // int sortedArray[] = sortingTheArray();

        System.out.print("Values after sorting: ");
        printElementsOfAnArray(bubbleSort(arrayToBeSorted));
    }

    static int[] bubbleSort(int arr[]) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    static void printElementsOfAnArray(int arr[]) {
        for(int length = 0; length<arr.length; length++) 
            System.out.print(arr[length] + " ");
        System.out.println();
    }
}


// public static void sortNumbers(int[] numbers) {
//     for (int i = 0; i < numbers.length - 1; i++) {
//       for (int j = i + 1; j < numbers.length; j++) {
//         if (numbers[i] > numbers[j]) {
//           // Swap numbers[i] and numbers[j]
//           int temp = numbers[i];
//           numbers[i] = numbers[j];
//           numbers[j] = temp;
//         }
//       }
//     }
//   }
// 20, 10, 30, 15, 50
// 10, 20, 30, 15, 50
// 10, 15, 30, 20, 50
// 10, 15, 30, 20, 50
// 10, 15, 20, 30, 50
/*
 i = 0 0<4   
 j= 1, 1<5     2, 2<5   3, 3<5      4, 4<5
 20>10         20>30     20>15        20>50
 temp = 20               temp = 20
 arr[i] = 10             15
 arr[j] = 20             20
 */
