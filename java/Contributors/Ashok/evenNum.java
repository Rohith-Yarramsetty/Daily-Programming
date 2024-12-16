import java.util.Scanner;
public class evenNum{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number :");
        int a=sc.nextInt();
       // System.out.println("enter b number :");
        //int b=sc.nextInt();
        if(a%2==0){
            System.out.println("a is even number"+a);
        }
        else
        System.out.println("a is odd number"+a);

    
    
}
}