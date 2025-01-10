// We had an array                         [1, 2, 3, 5, 3, 2, 5 ,2 ,1 ,6, 7]
// User enters a number in an array        6
// Keep the num in a variable              num = 6
// user for loop starting from arrayStart  to arrayEnd   for(arr[0], arr.length)
//   arr[i] == num                             if(arr[i] == num)
//       we have to count                           count++
// end loop 
//                                    num repeated count time

package Arrays;

import java.util.Scanner;
public class CountOfUserGivenNumberInArray {
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        int array[] = {4, 2, 4, 5, 6, 2, 1, 4, 7, 9};
        System.out.print("Enter the number user want: ");
        int num = getUserInput.nextInt();
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                count++;
            }
        }
        System.out.println(num + " exists " + count + " times.");
    }
}
