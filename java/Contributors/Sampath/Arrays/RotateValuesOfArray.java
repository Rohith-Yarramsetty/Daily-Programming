//Right Rotate (1,2,3,4,5)-->(5,1,2,3,4) if n=1
//Left Rotate (1,2,3,4,5)--->(2,3,4,5,1) if n=1

public class RotateValuesOfArray {
    public static void main(String[] args) {
        RotateValuesOfArray obj = new RotateValuesOfArray();
        obj.rightRotateArray();
        obj.leftRotateArray();

    }

    public void leftRotateArray(){
        int arr[] = {1,2,3,4,5};
        int n = 1,temp;
        int lastIndex = arr.length-1;       //4
        for(int i=0; i<arr.length; i++){    //
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n; i++){                     //0,0<3;1,1<3;
            temp = arr[0];                          //1,2
            for(int j=0; j<arr.length-1; j++){      //0,0<4;
                arr[j] = arr[j+1];                  //[2,3,4,5,5];[3,4,5,1,1]
            }                   
            arr[lastIndex] = temp;                  //[2,3,4,5,1];[3,4,5,1,2]
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    
    }
    public void rightRotateArray(){
        int arr[] = {1,2,3,4,5};
        int n = 1, temp;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            temp = arr[arr.length-1];
            for(int j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
