import java.util.*;
public class palindrome {

    public static void main(String[] args) {
        
        countOfnNumbers();
    }  
    public static void isPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        int lastDigit = 0;
        int tempNum = num;
        while(num>0){
            lastDigit = num%10;
            rev = rev*10+lastDigit;
            num = num/10;
        }
        if(tempNum == rev){
            System.out.println("Number is a palindrome: " +tempNum);
        }
        else{
            System.out.println("Number is not a palindrome: "+tempNum);
        }

    }

    public static void printThePalindromeNumbersBetweenTwoValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of X: ");
        int x = sc.nextInt();
        System.out.println("Enter a value of Y: ");
        int y = sc.nextInt();
        System.out.println("Palindrome numbers are: ");
        for(int i=x; i<=y; i++){
            int rev = 0;
            int lastDigit = 0;
            int tempNum = i;
            while(tempNum>0){
                lastDigit = tempNum%10;
                rev = rev*10+lastDigit;
                tempNum = tempNum/10;
            }
            if(i == rev){
                System.out.print(i + " ");
            }  
            
        }

    }


    public static void countOfPalindromeNubers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of X: ");
        int x = sc.nextInt();
        System.out.println("Enter a value of Y: ");
        int y = sc.nextInt();
        System.out.println(" Count of Palindrome numbers are: ");
        int count = 0;
        for(int i=x; i<=y; i++){
            int rev = 0;
            int lastDigit = 0;
            int tempNum = i;
            
            while(tempNum>0){
                lastDigit = tempNum%10;
                rev = rev*10+lastDigit;
                tempNum = tempNum/10;
                
            }
            if(i == rev){
                count++; 
            }  
            
        }
        System.out.println(count);
    }

    public static void countOfnNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input number: ");
        int n = sc.nextInt();
        int loopStart =10;
        int countOfPalindrome = 0;
        int rev = 0;
        int lastDigit = 0;
        int tempNum = n;
        while(countOfPalindrome != n) {
            rev = 0;
            lastDigit = 0;
            tempNum = loopStart;
            while(tempNum>0){
                lastDigit = tempNum%10;
                rev = rev*10+lastDigit;
                tempNum = tempNum/10;
            }
            if(loopStart == rev){
                System.out.println("List Of Palindrome Number are: " +loopStart);
                countOfPalindrome++;    
            }
            loopStart++;
        }
        
    }
        
}


// User have given a number  // num = 2
// loopstart = 10
// countOfPalindromes = 0
// You have to start your loop from 10 --> while(count != num)
// reverse the loopstart
// check if the loopstart is palindrome or not
// If loopstart is palindrome  ==> print(loopstart)
//                                  countodPalindrome++
// loopStart++

