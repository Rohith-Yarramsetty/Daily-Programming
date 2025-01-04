// arr1 = {1, 1, 2, 3, 6, 3, 4, 5, 6, 6, 7, 8}
// arr2 = {1. 3. 6, 8}
// output: 
// 1 exists 2 times
// 3 exists 2 times
// 6 exists 3 times
// 8 exists 1 times
package Contributors.Rohith.Arrays;
import java.util.*;

public class CountOfRepeatingArrayElementsInAnotherArray {
    public static void main(String[] args) {
        int randomArray[] = {1, 2, 4, 6, 9, 11, 2, 16, 5, 6, 9, 18, 23, 18};
        int numbersToBeChecked[] = {2, 3, 4, 9, 18};

        for(int i = 0; i < numbersToBeChecked.length; i++) {
            int countOfNumber = 0;

            for(int j = 0; j < randomArray.length; j++) {
                if(numbersToBeChecked[i] == randomArray[j]) 
                    countOfNumber ++;
            }


            System.out.println(numbersToBeChecked[i] + " exists " + countOfNumber + " no.of times in the array");
        }
    }
}
