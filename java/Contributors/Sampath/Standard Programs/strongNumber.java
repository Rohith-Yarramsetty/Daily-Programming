import java.util.*;
public class strongNumber {
    public static void main(String args[]) {

        printStrongNumberBetweenTwoValues();

    }

    public static void verifyNumberIsStrongNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: "); //145
        int num = sc.nextInt();
        int lastDigit = 0;
        int sum = 0;
        int tempNum = num;
        while(num != 0) {       //145,
            lastDigit = num%10;         //5,4,1
            int fact = 1;
            for(int i=1; i<=lastDigit; i++) {   //1
                fact = fact*i;      //120,24,1
            }
            sum = sum+fact;     //120,144,145
            num = num/10;       //14,1,0
        }
        if(tempNum == sum) {
            System.out.println(tempNum+" is a Strong Number");
        }
        else
            System.out.println(tempNum+" is not a Strong Number"); 
    }

    public static void printStrongNumberBetweenTwoValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X value: ");      //100
        int x = sc.nextInt();
        System.out.println("Enter Y value: ");      //200
        int y = sc.nextInt();
        
        for(int i=x; i<=y; i++){
            int temp = i; 
            int lastDigit = 0;
            int sum = 0;
            while(temp != 0){
                int fact = 1;
                lastDigit = temp%10;
                for(int j=1; j<=lastDigit; j++){
                    fact = fact*j;
                }
                sum = sum+fact;
                temp=temp/10;
            }
            if(sum == i){
                System.out.println("Strong number is: " +i);
            }
            // else
            //     System.out.println("Is not a Strong Number: "+i);
        }
    }


    public static void printStrongNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");     //145
        int n = sc.nextInt();
        int lastDigit = 0;
        int temp = n;
        int sum = 0;
        while(n != 0) {
            int fact = 1;
            lastDigit = n%10;
            for(int i=1; i<=lastDigit; i++){
                fact = fact*i;
            }
            sum = sum+fact;
            n = n/10;
        }
        if(temp == sum) {
            System.out.println("Strong Number: "+temp);
        }
        else {
            System.out.println("Not a Strong Number: "+temp);
        }
    }
}
