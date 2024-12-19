
import java.util.*;

public class reverseNumber {
    public static void main(String[] args) {

        revNumFromMultipleInp();

    }

    @SuppressWarnings({"resource", "reverseNumber"})
    static void reverseNumber(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        int lastDigit = 0;
        while(num>0){
            lastDigit = num%10;
            rev = rev*10+lastDigit;
            num = num/10;
        }
        System.out.println("Reversed Number: "+rev);
    }

    
    static void revNumFromMultipleInp(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input Number: ");
        int num = sc.nextInt();
        

        for(int i=0; i<num; i++){
            System.out.print("Enter a number: ");
            int numb = sc.nextInt();
            int rev =0;
            int lastDigit = 0;
            while(numb>0){

                lastDigit = numb%10;
                rev = rev*10+lastDigit;
                numb = numb/10;

            }
            System.out.println("Revered Number for given input: "+rev);   

        }

    }
    
}
