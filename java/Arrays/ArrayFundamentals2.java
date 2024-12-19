package Arrays;

public class ArrayFundamentals2 {
    public static void main(String[] args) {
        int arr [] = {2, 3, 5, 10, 3, 6, 20, 30, 15};

        int largestNumber = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>largestNumber) {     // 3>2 
                largestNumber = arr[i];    // 2   3 5 10 
            }
        }
        System.out.println("The largest number of the array is: "+ largestNumber);
    }
}
