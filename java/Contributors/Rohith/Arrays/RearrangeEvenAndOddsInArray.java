// Place all evens at left & odds at right 

package Arrays;

public class RearrangeEvenAndOddsInArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
                    // 0  1  2  3  4  5  6  7

        int leftIndexStart = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            if (array[i]%2 == 0) {
                temp = array[leftIndexStart];
                array[leftIndexStart] = array[i];
                array[i] = temp;
                leftIndexStart++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
