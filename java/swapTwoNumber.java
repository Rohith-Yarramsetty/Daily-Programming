import java.util.*;

public class swapTwoNumber {
    public static void main(String[] args){

        Scanner getUserInput = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = getUserInput.nextInt();
        System.out.print("Enter b value: ");
        int b = getUserInput.nextInt();

        System.out.println("Numbers before swap: " + a + " and " + b);

        int c;
        c = b;
        b = a;
        a = c;

        System.out.println("Numbers after swap: " + a + " and " + b);
    }
}
