import java.util.*;
public class evenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the Array values: ");
        int Arr[] = new int[size];

        for(int i=0; i<5; i++){
            Arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if(Arr[i]%2 ==0){
                System.out.println("Even values are: "+Arr[i]);
            }
        }
    }
}
