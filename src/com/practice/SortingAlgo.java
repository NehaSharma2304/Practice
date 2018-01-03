package com.practice;
import java.lang.reflect.Array;
import java.util.*;
/**
 *
 * Sort in place means to sort an existing list by modifying the element order directly within the list.
 * The opposite is leaving the original list as is and create a new list with the elements in order.
 * **/
public class SortingAlgo {
    public static void main (String[] arg) {
        bubbleSort();
    }

    static int arr[] = {53, 77, 16, 6, 67, 88, 11, 21, 5};
    /** Selection sorting
     * Time Complexity: O(n2) as there are two nested loops.
     *
     * concept try to find minimum number index and swap it.
     * * */
    public static void selectionSort () {
        for (int i=0; i < arr.length-1; i++) {
            int temp = i;
            for (int j=i+1; j < arr.length; j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
            }
            int swapTemp = arr[temp];
            arr[temp] = arr[i];
            arr[i] = swapTemp;
        }
        System.out.print(Arrays.toString(arr) );
    }

    /** Bubble sorting
     * Time Complexity: O(n2) as there are two nested loops.
     * arr.length-i-1 this condition coz we already placed largest element in the end
     * * */
    public static void bubbleSort () {
        //int arr[] = {53, 77, 16, 6, 67, 88, 11, 21, 5};
        for (int i=0; i < arr.length; i++) {
            for (int j=0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int swapTemp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = swapTemp;
                }
            }
        }
        System.out.print(Arrays.toString(arr) );
    }
}
