package Arrays;
import java.util.*;
public class arrayInitial {
    public static void main(String[]args){
       // disply();
       // int arr[]={1,2,3,4,5,6,7,8,9,10};
        //System.out.println(arr[0]+" "+arr[4]+" "+arr[8]);
       // disply();
       printOddNumbersInArray();
    }
    public static void disply(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the Five int values:");
         arr[0] = sc.nextInt();
         arr[1] = sc.nextInt();
         arr[2] = sc.nextInt();
         arr[3] = sc.nextInt();
         arr[4] = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void printArrayElementsAtEvenIndexes(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the Five int values:");
         arr[0] = sc.nextInt();
         arr[1] = sc.nextInt();
         arr[2] = sc.nextInt();
         arr[3] = sc.nextInt();
         arr[4] = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
            System.out.println(arr[i]);
        }
        
    }
    public static void printEvenNumbersInArray(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the Five int values:");
        
        for(int j=0;j<5;j++){
            arr[j] = sc.nextInt();// 10 20 30 40 50
                                   // 0  1  2  3  4
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0)
                System.out.println(arr[j]);
        }
    }
        public static void printOddNumbersInArray(){
            Scanner sc = new Scanner(System.in);
           // int n = sc.nextInt();
            System.out.println("enter n value: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("enter  values:");
            
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();// 10 20 30 40 50
                                       // 0  1  2  3  4
            }
            for(int j=0;j<arr.length;j++){
                if(arr[j]%2==1){
                    System.out.println("Odd numbers: "+arr[j]);
                }
            }
        
    

           
    
}
   
    
}
