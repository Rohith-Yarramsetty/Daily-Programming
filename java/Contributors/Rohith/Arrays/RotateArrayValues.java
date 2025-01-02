package Arrays;

import java.util.Scanner;

public class RotateArrayValues {
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter the no.of cycles to be rotated: ");
        int n = getUserInput.nextInt();
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        RotateArrayValues objCopy = new RotateArrayValues();
        System.out.println("Before Rotation: ");
        objCopy.printArrayValues(array);

        System.out.println("After rotating the array "+n+" times to right side");
        objCopy.printArrayValues(objCopy.rightRotateValues(array, n));

        System.out.println("Before Rotation: ");
        objCopy.printArrayValues(array);

        System.out.println("After rotating the array "+n+" times to left side");
        objCopy.printArrayValues(objCopy.leftRotateValues(array, n));
    }

    int[] rightRotateValues(int arr[], int n) {
        int lastIndex = arr.length-1, temp;

        for(int i1 = 0; i1 < n; i1++) {
            temp = arr[lastIndex];
            for(int i2 = lastIndex; i2 > 0; i2--) {
                arr[i2] = arr[i2-1];
            }
            arr[0] = temp;
        }
        return arr;
    }

    int[] leftRotateValues(int arr[], int n) {
        int lastIndex = arr.length-1, temp;

        for(int i1 = 0; i1 < n; i1++) {
            temp = arr[0];
            for(int i2 = 0; i2 < arr.length-1; i2++) {
                arr[i2] = arr[i2+1];
            }
            arr[lastIndex] = temp;
        }
        return arr;
    }

    void printArrayValues(int arr[]) {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
