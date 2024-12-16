import java.util.Scanner;
public class reversNum {
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
        System.out.println("Reverse number of a is : "+tem);
    }
    
}
