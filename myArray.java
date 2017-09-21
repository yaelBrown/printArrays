/*
 * File myArray.java
 * Author: Yael Brown
 * Date: September 21, 2017
 * Purpose: To determine length of 
 * array and print out contents of array
 */
import java.util.Arrays;

public class myArray {
    public static void main(String[] args){
        int arr[] = new int[] {
            12,
            43,
            62,
            75,
            47,
        };

        System.out.print("Length of Array is " + arr.length + ". The contents of array is ");
        System.out.print(Arrays.toString(arr));
    }
}