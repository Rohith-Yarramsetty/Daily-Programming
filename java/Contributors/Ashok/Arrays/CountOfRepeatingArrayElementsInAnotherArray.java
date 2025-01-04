package Arrays;
import java.util.Scanner;
public class CountOfRepeatingArrayElementsInAnotherArray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1,1,2,3,6,3,4,5,6,6,7,8};
        int arr2[] = {1,3,6,8};
            for(int i=0;i<arr2.length;i++){ //2<4
                int count = 0; //
        
                for(int j=0;j<arr1.length;j++){ //8<12
                    if(arr2[i]==arr1[j]){ //1==1 1==2\6==6
                        count++;//3
                    }
                }
                    System.out.println(arr2[i]+ " is Exits in "+count);
            }
    }
}