
import java.util.Scanner;

public class smallestNumberArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int arrsize = sc.nextInt();
        System.out.println("Enter the values: ");
        int arr[] = new int[arrsize];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int smallestNumber = arr.length;
        for( int i=0; i<arr.length; i++){
            if(smallestNumber>arr[i]){
                smallestNumber = arr[i];
            }
        }
        System.out.println("Smallest Number of Array is: "+smallestNumber);
    }
}