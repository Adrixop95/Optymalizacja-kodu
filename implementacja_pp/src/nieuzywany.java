/*
Created by Adrian Rupala 2018
@author Adrixop95
 */

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class nieuzywany {
    
    public static void dirty_code_sum(int data_a, int data_b){
        int sum = 0;
        
        for( int i = 0; i <= data_a + data_b; i++){
            int x = 0;
            int y = 0;
            x = data_b;
            y = data_a;
            sum = x + y;
        }
        
        System.out.print(sum);
    }
    
    public static void code_sum(int data_a, int data_b) {
        int sum = 0;
        
        sum = data_a + data_b;
        
        System.out.print(sum);

    }
    
    public static void dirty_multiply_sum(int data_a, int data_b, int data_z){
        int mult = 0;
        
        for( int i = 0; i <= data_a + data_b * data_z; i++){
            int x = 0;
            int y = 0;
            int z = 0;
            z = data_z;
            x = data_b;
            y = data_a;
            mult = x + y * z;
        }
        
        System.out.print(mult);
    }
    
    public static void multiply_sum(int data_a, int data_b, int data_z) {
        int mult = 0;
        
        mult = data_a + data_b * data_z;
        
        System.out.print(mult);
    }
    
    public static int[] dirty_merge(int[] data_a, int[] data_b){
        int[] sum = null;
        
        //bezsensowne iterowanie, błąd dla innych wartości niż data_a.length > 1;        
        
        for(int i = 0; i < data_a.length; i++) {
            sum = IntStream.concat(Arrays.stream(data_a), Arrays.stream(data_b)).toArray();
            System.out.print(Arrays.toString(sum));
        }
        
        return sum;
    }
    
    public static int[] merge(int[] data_a, int[] data_b) {
        int[] sum = null;
        
        sum = IntStream.concat(Arrays.stream(data_a), Arrays.stream(data_b)).toArray();
        
        return sum;
    }
    
    public static void dirty_fun(int[] data_a, int[] data_b){ //bezsensowne pobranie tablic które nie są potrzebne, celowo
    
        //normalne otwarcie strony
        URI web_link = null;
        try {
            web_link = new URL("https://hackintosh-polska.pl/guides/").toURI();
        } catch (MalformedURLException | URISyntaxException ex) {
            Logger.getLogger(nieuzywany.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            java.awt.Desktop.getDesktop().browse(web_link);
        } catch (IOException ex) {
            Logger.getLogger(nieuzywany.class.getName()).log(Level.SEVERE, null, ex);
        }

        // pełna moc procesora, dla beki bo nieoptymalny kod milion
        // w pełni celowe działanie
        int count = Runtime.getRuntime().availableProcessors();
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                while (true);
            }).start();
        }
    }
        
    public static void fun() {
        //otwieranie strony internetowej, ładnie i czysto
        
        URI web_link = null;
        try {
            web_link = new URL("https://hackintosh-polska.pl/guides/").toURI();
        } catch (MalformedURLException | URISyntaxException ex) {
            Logger.getLogger(nieuzywany.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            java.awt.Desktop.getDesktop().browse(web_link);
        } catch (IOException ex) {
            Logger.getLogger(nieuzywany.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Uruchamianie, odwołania, testy
      
    public static void exec_dirty_code_sum(int data_a, int data_b) {
        Instant start0 = Instant.now();
        dirty_code_sum(data_a, data_b);
        Instant end0 = Instant.now();  
        System.out.println("\nSuma 2 liczb z brudnym kodem: " + Duration.between(start0, end0));
    }
    
    public static void exec_code_sum(int data_a, int data_b) {
        Instant start0 = Instant.now();
        code_sum(data_a, data_b);
        Instant end0 = Instant.now();  
        System.out.println("\nSuma 2 liczb: " + Duration.between(start0, end0));
    }
    
    public static void exec_dirty_multiply_sum(int data_a, int data_b, int data_z) {
        Instant start0 = Instant.now();
        dirty_multiply_sum(data_a, data_b, data_z);
        Instant end0 = Instant.now();  
        System.out.println("\nDodawanie oraz mnozenie (a+b*z) brudne: " + Duration.between(start0, end0));
    }
    
    public static void exec_multiply_sum(int data_a, int data_b, int data_z) {
        Instant start0 = Instant.now();
        multiply_sum(data_a, data_b, data_z);
        Instant end0 = Instant.now();  
        System.out.println("\nDodawanie oraz mnozenie (a+b*z): " + Duration.between(start0, end0));
    }
    
    public static void exec_dirty_merge(int[] data_a, int[] data_b){
        
        Instant start0 = Instant.now();
        dirty_merge(data_a, data_b);
        Instant end0 = Instant.now();  
        System.out.println("\nCzas polaczenia 2 tablic z bledami/brudnym kodem: " + Duration.between(start0, end0));
    }
    
    public static void exec_merge(int[] data_a, int[] data_b){
        
        Instant start0 = Instant.now();
        System.out.print(Arrays.toString(merge(data_a, data_b)));
        Instant end0 = Instant.now();  
        System.out.println("\nCzas polaczenia poprawnie 2 tablic: " + Duration.between(start0, end0));
    }
    
    public static void exec_dirty_fun(int[] data_a, int[] data_b){
        Instant start0 = Instant.now();
        dirty_fun(data_a, data_b);
        Instant end0 = Instant.now();  
        System.out.println("\nCzas otwarcia strony internetowej (brudny kod) " + Duration.between(start0, end0));
    }    
    
    public static void exec_fun(){
        Instant start0 = Instant.now();
        fun();
        Instant end0 = Instant.now();  
        System.out.println("\nCzas otwarcia strony internetowej " + Duration.between(start0, end0));
        System.out.println("\nAby przerwac dzialanie \"zlosliwego\" kodu uruchom ponownie aplikacje.");
    }
}
