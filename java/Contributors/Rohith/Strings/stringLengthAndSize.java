package Strings;
import java.io.*;
import java.util.*;

public class stringLengthAndSize {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lengthOfBothStringsIs = A.length()+B.length();
        boolean bGreaterThanA = A.compareTo(B) > 0;
        A = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        B = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        System.out.println(lengthOfBothStringsIs);
        if(bGreaterThanA) System.out.println("Yes");
        else System.out.println("No");
        System.out.println(A+ " " +B);
    }
}
