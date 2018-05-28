/*
Created by Adrian Rupala 2018
@author Adrixop95
 */

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class unikanie {
    
    public static void dirty_avoid_multiplies(int data){
        
        for (int i = 0; i < 10; i++){
            System.out.print(i*10);
        }
    }
    
    public static void avoid_multiplies(int data){
        
        for (int i = 0; i < 100; i+=10) {
            System.out.print(i);
        }
    }
    
    public static int[] dirty_loop_overhead(int[] data){
        
        for (int i = 0; i < 100; i++){
            Arrays.sort(data);
        }
        
        return data;
    }
    
    public static int[] loop_overhead(int[] data){
        
        int i = 99;
        
        do {
            Arrays.sort(data);
            i--;
        } while (i >= 0);
        
        return data;
    }
    
    public static void dirty_strength_reduction(int data){
        
        int i, sum = 0;
        
        for (i = 1; i <= data; i++){
            sum += i;
        }
        
        System.out.print(sum);
    }
    
    public static void strength_reduction(int data){
        
        int sum = data * (1 + data) / 2;
        System.out.print(sum);
    }     
    
    
    //Wywołania i testy
    public static void exec_dirty_avoid_multiplies(int data){
        Instant start = Instant.now();
        dirty_avoid_multiplies(data);
        Instant end = Instant.now();
        System.out.println("\nZwykle mnozenie: " + Duration.between(start, end));
    }
    
    public static void time_d_avoid_multiplies(int data){
        Instant start = Instant.now();
        dirty_avoid_multiplies(data);
        Instant end = Instant.now();
        System.out.format("%f%n",Duration.between(start, end));
    }
    
    public static void exec_avoid_multiplies(int data){
        Instant start = Instant.now();
        avoid_multiplies(data);
        Instant end = Instant.now();
        System.out.println("\nUzycie roznic skonczyonch aby uniknac mnozenia: " + Duration.between(start, end));
    }    
     
    public static void exec_dirty_loop_overhead(int[] data){
        Instant start = Instant.now();
        dirty_loop_overhead(data);
        Instant end = Instant.now();
        System.out.println("\nPetla for: " + Duration.between(start, end)); 
    }
    
    public static void exec_loop_overhead(int[] data){
        Instant start = Instant.now();
        loop_overhead(data);
        Instant end = Instant.now();
        System.out.println("\nPetla do-while: " + Duration.between(start, end));   
    }
    
    public static void exec_dirty_strength_reduction(int data){
        
        Instant start = Instant.now();
        dirty_strength_reduction(data);
        Instant end = Instant.now();
        System.out.println("\nSilna redukcja (brudny kod): " + Duration.between(start, end));   
    }
    
    public static void exec_strength_reduction(int data){
                
        Instant start = Instant.now();
        strength_reduction(data);
        Instant end = Instant.now();
        System.out.println("\nSilna redukcja: " + Duration.between(start, end));   
    }
    
}
