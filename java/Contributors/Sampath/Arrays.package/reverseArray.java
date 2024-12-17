import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        
    }

}
// public class ArrayReverse {
//     public static void main(String[] args) {
//         Scanner getUserInput = new Scanner(System.in);
//         System.out.print("Enter the array size: ");
//         // System.out.println();
//         int arraySize = getUserInput.nextInt();

//         // Declare an array
//         int array[] = new int[arraySize];

//         // Initialize the array
//         System.out.println("Enter the array values: ");
//         for(int i = 0; i<arraySize; i++) {
//             array[i] = getUserInput.nextInt();
//         }

//         // Print the array values before reversing
//         System.out.println("Value of array before reversing: ");
//         printArrayValues(array);

//         // Print the array values before reversing
//         System.out.println("Value of array after reversing: ");
//         printArrayValues(reverseTheArrayValues(array));
//     }
//     static void printArrayValues(int arr[]) {
//         for(int i = 0; i < arr.length; i++)
//             System.out.print(arr[i] + " ");
//         System.out.println();
//     }

//     static int[] reverseTheArrayValues(int arr[]) {
//         int temp, lastIndex = arr.length-1;
//         for(int i = 0; i < arr.length/2; i++) {
//             temp = arr[lastIndex];
//             arr[lastIndex] = arr[i];
//             arr[i] = temp;
//             lastIndex--;
//         }
//         return arr;
//     }
// }