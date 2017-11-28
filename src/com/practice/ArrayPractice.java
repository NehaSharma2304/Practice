package com.practice;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class ArrayPractice {
/**
 *
 * String is immutable means that you cannot change the object itself,
 * but you can change the reference to the object. When you called a = "ty",
 * you are actually changing the reference of a to a new object created by the String literal "ty"
 *
 * **/
    static Scanner sc = new Scanner(System.in); // Reading from System.in
    public static void main(String[] s) {
        String str = new String("knowledge");
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayPractice arrayObj = new ArrayPractice();
        System.out.println(Arrays.toString(arr));
        arrayObj.rotate(arr, 5, 10);
    }

    /**
     *
     * **/

    void rotate(int[] ar, int d, int n) {
        System.out.println(Arrays.toString(ar));
        for (int i=0; i < ar.length; i++) {
            int temp = ar[i];
            if((i+d) < ar.length - 1) { // 0 - 2
               ar[i] = ar[i+d];
                ar[i+d] = temp;
            } else {

                ar[i] = ar[i+d];
                ar[i+d] = temp;
                d-= 1;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
