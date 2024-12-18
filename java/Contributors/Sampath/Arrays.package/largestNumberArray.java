
import java.util.Scanner;

public class largestNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arrsize = sc.nextInt();
        System.out.println("Enter the array values: ");
        int arr[] = new int[arrsize];           //1,2,3,4,5
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int largeNumber = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largeNumber){
                largeNumber=arr[i];
            }
        }
        System.out.println("Largest number of Array: "+largeNumber);
    }
}
