import java.util.Scanner;
public class factorialNumber {
    
    public static void main(String[] args) {
        printNumberIsFactorial();
    }

    public static void verifyNumberIsFactorial() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=fact; i<=num; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial Number is: "+fact);
    }
    
    public static void printNumberIsFactorial() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=fact; i<=num; i++) {
            fact = fact*i;
            System.out.println("Factorial Number for "+i+" is "+fact);
        }
    }
}
