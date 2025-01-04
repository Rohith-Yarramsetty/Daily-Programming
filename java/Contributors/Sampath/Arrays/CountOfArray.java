
import java.util.Scanner;

public class CountOfArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,2,3,4,34,5,4,43};
        System.out.println("Enter a input to check: ");
        int num = sc.nextInt();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(num == arr[i]){
                count++;
            }
        }
        System.out.println("Count Of "+num+ " is "+count+ " times");
    }
}