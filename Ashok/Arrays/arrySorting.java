package Arrays;
import java.util.Scanner;
public class arrySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user value:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
           arr1[i]=sc.nextInt();
        }
        //System.out.print("given Array values are: "+arr1[i]);//10 20 15 5 12 
       // System.out.println();
        for(int i=0;i<arr1.length-1;i++){ //0 //1 //2 //3
            for(int j=i+1;j<arr1.length;j++){ //1 //2 //3 //4
                if(arr1[i]>arr1[j]){ //10>20 10>15 10>5 10>12..20>15 15>10 10>12..20>15 15>12..20>15
                    int tem = arr1[i]; //10 //20 //15 //20 //15 //20
                    arr1[i] = arr1[j]; //5 //15 //10 //15 //12 //15
                    arr1[j] = tem; //10 //20 //15 //20 //15 //20
                }
               // System.out.print("Print the sorted Values: "+arr1[i]);
                //System.out.print("Print the sorted Values: "+arr1[i+1]);
                //5 20 15 10 12
                //5 15 20 10 12
                //5 10 20 15 12
                //5 10 15 20 12
                //5 10 12 20 15
                //5 10 12 15 20

            }
        }
        System.out.println("Print the sorted Values: ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        //System.out.print("Print the sorted Values: "+arr1);
        
    }
    
}
