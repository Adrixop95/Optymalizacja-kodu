
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

/*
Created by Adrian Rupala 2018
@author Adrixop95
 */

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
    
    
    //Wywołania i testy
    public static void exec_dirty_avoid_multiplies(int data){
        Instant start = Instant.now();
        dirty_avoid_multiplies(data);
        Instant end = Instant.now();
        System.out.println("\nZwykle mnozenie: " + Duration.between(start, end));
    }
    
    public static void exec_avoid_multiplies(int data){
        Instant start = Instant.now();
        avoid_multiplies(data);
        Instant end = Instant.now();
        System.out.println("\nnUzycie roznic skonczyonch aby uniknac mnozenia: " + Duration.between(start, end));
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
    
}
