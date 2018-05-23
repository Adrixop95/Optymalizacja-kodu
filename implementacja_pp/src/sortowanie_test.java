/*
Created by Adrian Rupala 2018
@author Adrixop95
 */

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class sortowanie_test {

    //Algorytmy sortowania bazując na stronie www.geeksforgeeks.org
    public static int[] selectionSort(int[] data){
        int n = data.length;
        int j = 0;
        int tmp = 0;
        
        for (int i=0; i < n; i++) {
            j = i;
            for (int k = i; k < n; k++) {
                if (data[j] > data[k]) {
                    j = k;
                }
            }
            tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
       
        return data;
    }
    
    public static int[] bubbleSort(int[] data) {
        int n = data.length;
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (data[j - 1] > data[j]) {
                    tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                }
            }
        }
        
        return data;
    }    
    
    public static int[] insertionSortRecursive(int data[], int data_length) {
        if (data_length <= 1) {
            return data;
        }
      
        insertionSortRecursive(data, data_length-1);
        int last = data[data_length-1];
        int j = data_length-2;
      
        while (j >= 0 && data[j] > last) {
            data[j+1] = data[j];
            j--;
        }
        data[j+1] = last;
        
        return data;
    }
    
    // Wywołanie gotowych schematów sortowań 
    
    public static int[] exec_selectionSort(int[] data) {
        
        Instant start = Instant.now();
        System.out.println("Posortowania tablica algorytmem Selection Sort: " + Arrays.toString(selectionSort(data)));
        Instant end = Instant.now();
        System.out.println("Czas sortowania: " + Duration.between(start, end));
            
        return null;
    }
    
    public static int[] exec_bubbleSort(int[] data) {
        
        Instant start = Instant.now();
        System.out.println("Posortowania tablica algorytmem Bubble Sort: " + Arrays.toString(bubbleSort(data)));
        Instant end = Instant.now();
        System.out.println("Czas sortowania: " + Duration.between(start, end));
            
        return null;        
    }
    
    public static void exec_insertionSortRecursive(int[] data){
        Instant start = Instant.now();
        System.out.println("Posortowania tablica algorytmem Insertion Sort: " + Arrays.toString(insertionSortRecursive(data, data.length)));
        Instant end = Instant.now();
        System.out.println("Czas sortowania: " + Duration.between(start, end));
        
    }
}
