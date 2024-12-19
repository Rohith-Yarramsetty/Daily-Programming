import java.util.Scanner;

public class strongBet {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x value :");
        int x = sc.nextInt();
        System.out.println("Enter the y value :");
        int y = sc.nextInt();
        int count = 0;
        for(int j=x;j<y;j++){
        int n = j;
        int sum = 0;
        int num = n;
        while(n!=0){
        int last = n%10;
        int tem = last;
        int prod=1;
        for(int i=1;i<=tem;i++){
            prod = prod*i;// 1*2*6**24*120
        }
    
        sum = sum+prod;
       n = n/10;
    }
        if(num == sum){
        System.out.println("The given number is a Strong Number : "+num);
        count++;
        }
        /*else{
            System.out.println("The given number is not a Strong Number :"+num);
        }*/
    }
        System.out.println(" Count of Strong Number is: "+count);
    }
    
    
}
