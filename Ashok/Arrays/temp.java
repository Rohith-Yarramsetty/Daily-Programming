package Arrays;

public class temp {
    public static void main(String[]args){
        int arr[] = {10,20,30,40,50,60,70,80,90};
        //            0  1  2  3  4  5   6  7  8
        System.out.println("Array Elements Before Reverse: ");
        for(int i=0;i<arr.length;i++){
           // System.out.println("Array Elements Before Reverse: ");
            System.out.println(arr[i]);
        }
        //int rev = arr.length-1; //4 3
        int rev = arr.length-1; //8
        int temp;
        System.out.println("Array Elements After Reverse:");
        for(int i=0;i<arr.length/2;i++){ //0<4,1<4
             temp = arr[rev]; // 90 //80 //30//20//10
            arr[rev] = arr[i]; // 10 //20 //30//40//50
            arr[i] = temp; // 90 //80//30//20//10
            rev--; // 7 //2 //1//0          //50 //40//30//20//10
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       // rev--;
    }
    
}
/*static int[] reverseTheArrayValues(int arr[]) {
    int temp, lastIndex = arr.length-1;
    for(int i = 0; i < arr.length/2; i++) {
        temp = arr[lastIndex];
        arr[lastIndex] = arr[i];
        arr[i] = temp;
        lastIndex--;*/
