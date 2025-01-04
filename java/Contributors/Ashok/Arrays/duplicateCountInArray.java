package Arrays;
import java.util.Scanner;
public class duplicateCountInArray {
    public static void main(String[] args) {
        int arr[] = {2,4,3,1,3,4,56,3,2,2};
        for(int i=0;i<arr.length;i++){ //1<10
            boolean alreadyCount =false;
            for(int j=0;j<i;j++){ //9<10
                if(arr[i]==arr[j]){ //4==2
                    alreadyCount = true;
                }
            }
            if(!alreadyCount){
                int count =0;
                for(int j=0;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                System.out.println(arr[i] +" Repeated in " +count +" Times");
            }
        }
    }
}
