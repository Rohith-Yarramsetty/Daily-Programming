import java.util.Scanner;
public class noOfPalin {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter user value n: ");
        int n = sc.nextInt();
        int countOfPalindrome = 0;
        int loopstart = 10;
        while(countOfPalindrome!=n){
            int last = 0;
            int tem = loopstart;
            int rev = 0;
            while(tem>0){
                last = tem%10;
                rev = rev*10+last;
                tem = tem/10;
            }
            if(rev==loopstart){
                System.out.println("given number is palindrom "+loopstart);
                countOfPalindrome++;
            }
            loopstart++;
            
        }
        //loopstart++;
    }
    
}
