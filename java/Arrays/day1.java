package Arrays;

public class day1 {
    public static void main(String[] args) {
        // Array Declaration
        int declareArray[];
        declareArray = new int[4];

        // Declare Array with size
        int arrayWithSize[] = new int[10];

        // Initialize the array     0   1   2    3
        int initializeTheArray[] = {10, 20, 30, 40};

        // Print the values of an array with their positions
        System.out.println(initializeTheArray[0]);
        System.out.println(initializeTheArray[2]);
        System.out.println(initializeTheArray[3]);

        // Print all the elements of an array
        System.out.println("All the values of array are: ");
        int initializeTheArray2[] = {11, 22, 33, 45, 56, 67, 78, 89, 90, 73};    
        //                           0    1   2   3   4   5   6   7  8    9
        // System.out.println(initializeTheArray2);

        for(int index = 0; index < 10; index++) {
            System.out.print(initializeTheArray2[index] + " ");
        }
        System.out.println();

        // Print the values of array that are in odd indexes
        System.out.println("The values of odd indexes are: ");
        for(int index = 1; index < initializeTheArray2.length; index+=2) {
            System.out.print(initializeTheArray2[index] + " ");
        }
        System.out.println();

        // Print the values of array that are in even indexes
        System.out.println("The values of even indexes are: ");
        for(int index = 0; index < initializeTheArray2.length; index+=2) {
            System.out.print(initializeTheArray2[index] + " ");
        }
        System.out.println();
    }
}
