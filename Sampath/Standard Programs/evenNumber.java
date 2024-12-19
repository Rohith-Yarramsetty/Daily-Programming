import java.util.*;
public class evenNumber {
    public static void main(String[] args){
        
        getFirstEvenNumbers();

    }

    static void verifyTheNumberIsAnEvenNumber(){
        int num =14;
        if(num%2==0)
            System.out.println(num + " is even number");
        else
            System.out.println(num + " is odd number");
    }

    static void verifyUserNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%2==0)
            System.out.println(num + " is even number");

        else
            System.out.println(num + " is odd number");

        System.out.println("Done");
    }

    static void verifyEvenNumbersInRange() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start range: ");
        int x = sc.nextInt();
        System.out.print("End range: ");
        int y = sc.nextInt();
        System.out.println("Output is:");
        for(int i=x;i<=y;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }


    static void getCountOfEvenNumInRange() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Start range: ");
        int x = sc.nextInt();
        System.out.print("End range: ");
        int y = sc.nextInt();
        System.out.println("Output is:");
        int count=0;
        
        for(int i=x;i<=y;i++){
            
            if(i%2==0){
                count++; 
            }      
        }
        System.out.println("Count is: " +count);     
    }

    static void getFirstEvenNumbers() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int start = 1;
        int count = 0;
    
        while(0<x){
            if(start%2==0){
                System.out.println(start);
                count++;  
            }
            start++;
            if(x==count){
                break;
            }
        }
    }

}



