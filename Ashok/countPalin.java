import java.util.Scanner;

public class countPalin {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            System.out.println("enter x number :");
            int x=sc.nextInt();
            System.out.println("enter y number :");
            int y=sc.nextInt();
            int tem = 0;
            int rev = 0;
            int last = 0;
            int count = 0;
            for(int i=x;i<y+1;i++){
                 tem = i;
                  rev = 0;
                  //last = 0;
                while(tem>0){
                    last = tem%10;
                    rev=rev*10+last;
                    tem=tem/10;
                    //count++;
                }
                //count++;
               if(i==rev){
                count++;
               System.out.println("Count a " +i+ " Palindrom: "+count);
               } 
            }
            

}
    
}
