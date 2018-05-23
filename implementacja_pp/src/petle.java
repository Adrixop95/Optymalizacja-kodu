import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class petle {
    
    // Przykłady wpływu spłaszacznia pętli (złożoności obliczeniowe od O(nlogn), O(n^2), O(n^3) zależne od ilości pętli)
    public static int[] loops_On(int[] data3){
        for (int i=0; i<1000; i++){
            Arrays.sort(data3);
        }
        return data3;
    }

    public static int[] loops_On2(int[] data2){
        for (int i=0; i<100; i++){
            for (int j=0; j<10; j++){
                Arrays.sort(data2);
            }
        }
        return data2;
    }    
    
    public static int[] loops_On3(int[] data1){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                for (int q = 0; q < 10; q++){
                    Arrays.sort(data1);
                }
            }
        }
        return data1;
    }
    
    public static int[] wyw_loops_On3(int[] data){
        Instant start2 = Instant.now();
        loops_On3(data);
        Instant end2 = Instant.now();
        System.out.println("\n O(n3): " + Duration.between(start2, end2));
        
        return null;
    }
    
    public static int[] wyw_loops_On2(int[] data){
        Instant start1 = Instant.now();
        loops_On2(data);
        Instant end1 = Instant.now();
        System.out.println("\n O(n2): " + Duration.between(start1, end1));
        
        return null;
    }
    
    public static int[] wyw_loops_On(int[] data){
        Instant start0 = Instant.now();
        loops_On(data);
        Instant end0 = Instant.now();  
        System.out.println("\n O(nlogn): " + Duration.between(start0, end0));
        
        return null;
    }
    
    
    // Przykłady łączenia pętli
    public static int[] not_combine_loop(int[] data){
        Instant start0 = Instant.now();
        
        for (int i = 0; i < 200; i++){   
            Arrays.sort(data);
        }
        
        for (int i = 0; i < 200; i++){
            Arrays.binarySearch(data, 4, 8, 12);
        }
        
        for (int i = 0; i < 200; i++){
            Arrays.hashCode(data);
        }
        
        for (int i = 0; i < 200; i++){
            Arrays.toString(data);
        }
        
        Instant end0 = Instant.now();  
        System.out.println("\n Czas dzialania petli niepolaczonych [sort, binarySearch, hashCode, toString]: " + Duration.between(start0, end0));
                
        return data;
    }
    
    public static int[] combine_loop(int[] data){
        
        Instant start0 = Instant.now();
        
        for (int i = 0; i < 200; i++){
            Arrays.sort(data);
            Arrays.binarySearch(data, 4, 8, 12);
            Arrays.hashCode(data);
            Arrays.toString(data);

        }
        
        Instant end0 = Instant.now();  
        System.out.println("\n Czas dzialania petli polaczonych [sort, binarySearch, hashCode, toString]: " + Duration.between(start0, end0));

        
        return data;
    }
    
}