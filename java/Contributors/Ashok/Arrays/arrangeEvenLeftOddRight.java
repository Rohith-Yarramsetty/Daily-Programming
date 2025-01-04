package Arrays;

public class arrangeEvenLeftOddRight {
    public static void main(String[]args){
        int arr[] = {4,2,3,8,5,6,7,9,10}; //
        int leftIndex = 0;
        for(int i=0;i<arr.length;i++){ //1<9
            if(arr[i]%2==0){ //2
                int temp = arr[leftIndex]; //1
                arr[leftIndex] = arr[i];//arr[0]=2
                arr[i] = temp;//arr[1]=1
                leftIndex++;//1
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
