//wap the given number is palindrom
import java.util.Scanner;
public class palindrom {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int a=sc.nextInt();
        int tem = 0;
        int last = 0;
        int x = a;

        while(x>0){
           last = x%10;
           tem =tem*10+last;
           x = x/10;
        }
        if(a==tem)
          System.out.println("Given number is Palindrom: " +a);
        else
        System.out.println("Given number is not a Palindrom: " +a);
    
}
}
