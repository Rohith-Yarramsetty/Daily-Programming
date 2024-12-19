import java.util.*;

public class sumOfArraryIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size: ");
        int arraySize = sc.nextInt();
        int arr[] = new int[arraySize];
        System.out.println("Enter the values of Array: ");
        for(int i=0; i<arraySize; i++){
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for( int i=0; i<arr.length; i++){
            temp = temp+arr[i];
        }
        System.out.println("Sum of Array Elements is: " +temp);
        int count = 0;
        for(int i=2; i<temp; i++){
            if(temp%i == 0){
                count++;
            }
        }
        if(count == 0)
            System.out.println(temp+" is a Prime Number");
        else
            System.out.println(temp+" is not a Prime Number");
    }
}
