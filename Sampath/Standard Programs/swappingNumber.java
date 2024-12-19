import java.util.Scanner;
public class swappingNumber{
    public static void main(String[] args) {

        sampath.swappingNum();
        swappingNumber.swappingNum();

    }
    static void swappingNum(){
        System.out.println("Sampath: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int x = sc.nextInt();
        System.out.print("Enter a second number: ");
        int y = sc.nextInt();
        int a,b;
        a = y;
        b = x;
        x = a;
        y = b;
        System.out.println("Swapped first number is: "+a);
        System.out.println("Swapped second number is: "+b);
    }
        
    
    
}



class sampath {
    static void swappingNum(){
        System.out.println("Sampath: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int x = sc.nextInt();
        System.out.print("Enter a second number: ");
        int y = sc.nextInt();
        int a,b;
        a = y;
        b = x;
        x = a;
        y = b;
        System.out.println("Swapped first number is: "+a);
        System.out.println("Swapped second number is: "+b);
    }
        
    
    
}