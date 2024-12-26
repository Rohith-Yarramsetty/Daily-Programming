import java.util.*;
public class uniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,4,2,6,3,3,5,3,7,8};
        System.out.println("Unique values in an Array: ");
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1)
                System.out.println(arr[i]);
        }
    }
}


