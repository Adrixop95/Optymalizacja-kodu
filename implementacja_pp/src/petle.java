
import java.util.Arrays;

public class petle {
    
    public static int[] loops_On(int[] data3){
        for (int i=0; i<1000; i+=1){
            Arrays.sort(data3);
        }
        return data3;
    }

    public static int[] loops_On2(int[] data2){
        for (int i=0; i<100; i+=1){
            for (int j=0; j<10; j+=1){
                Arrays.sort(data2);
            }
        }
        return data2;
    }    
    
    public static int[] loops_On3(int[] data1){
        for (int i = 0; i < 10; i += 1){
            for (int j = 0; j < 10; j += 1){
                for (int q = 0; q < 10; q += 1){
                    Arrays.sort(data1);
                }
            }
        }
        return data1;
    }
}
