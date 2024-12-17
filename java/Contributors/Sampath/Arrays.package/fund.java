import java.util.*;
public class fund {
    public static void main(String[] args) {
        //to declare array 
        int arr[];
        arr = new int[5];

        //declare array with size
        int ary[] = new int[5];

        //intialize array with size
        int arry[] = {1,2,3,4,5};

        //System.out.println(arry[0]+" "+arry[2]+" "+arry[4]);

        //array with higher vlues
        int arryy[] = {0,1,2,3,4,5,6,7,8,9};
        for(int i=1; i<10; i=i+2) {
            //if( == 1){

                //System.out.println(arryy[i]);

           //}

            
        }
    //     System.out.println(arryy[0]);
    //     System.out.println(arryy[1]);
    //     System.out.println(arryy[2]);
    //     System.out.println(arryy[3]);
    //     System.out.println(arryy[4]);
    //     System.out.println(arryy[5]);
    //     System.out.println(arryy[6]);
    //     System.out.println(arryy[7]);
    //     System.out.println(arryy[8]);
    //     System.out.println(arryy[9]);
    //    // System.out.println(arryy[10]);

        
        Scanner sc= new Scanner(System.in);
        int arryyy[] = new int[5];
        System.out.println("Enter the Array value: ");
        arryyy[0] = sc.nextInt();
        arryyy[1] = sc.nextInt();
        arryyy[2] = sc.nextInt();
        arryyy[3] = sc.nextInt();
        arryyy[4] = sc.nextInt();

        System.out.println("Array values are: "+arryyy[0]+" "+arryyy[1]+" "+arryyy[2]+" "+arryyy[3]+" "+arryyy[4]);


    }
    
    
}
