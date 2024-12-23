// User given an array
// array is {1, 2, 3, 3, 4, 5, 1, 6}
// output is: 2, 3, 5, 6

package Arrays;

import java.util.Scanner;

public class PrintUniqueValuesOfArray {
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        int array[] = {4, 2, 4, 5, 6, 2, 1, 4, 7, 9};

        for(int i = 0; i < array.length; i++) {
            int count = 0;
            for(int j = 0; j < array.length; j++) {
                if(array[i]==array[j]) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

