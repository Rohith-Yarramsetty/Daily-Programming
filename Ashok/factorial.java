import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value :");
        int n = sc.nextInt();
        int prod=1;
        for(int i=1;i<=n;i++){
            prod = prod*i;
        }
        System.out.println("The product of " +n+ " is :"+prod);
    }
    
}
