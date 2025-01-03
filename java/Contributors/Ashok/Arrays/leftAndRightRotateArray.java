
package Arrays;
import java.util.Scanner;
public class leftAndRightRotateArray {
    public static void main(String[]args){
        printLeftArrayValues();
        printRightArrayValues();
    }
    public static void printLeftArrayValues(){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};//
        System.out.println("Enter value from user for left rotate:");
        int userValue = sc.nextInt();
        int temp = 0;
        int lastIndex = arr.length-1;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<userValue;i++){
            temp = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[lastIndex] = temp;
        }
        //System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void printRightArrayValues(){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        System.out.println("Enter value from user for right rotate:");
        int userValue = sc.nextInt();
        int temp = 0;
        int lastIndex = arr.length-1;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<userValue;i++){
            temp = arr[lastIndex];
            for(int j=lastIndex;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
