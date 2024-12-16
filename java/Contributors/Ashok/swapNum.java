import java.util.Scanner;
public class swapNum {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Before swapping :");
        System.out.println("enter a number :");
        int a=sc.nextInt();
        System.out.println("enter b number :");
        int b=sc.nextInt();
        System.out.println("After swapping :");
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("value of a is:"+a);
        System.out.println("value of b is:"+b);



    }
    
}
