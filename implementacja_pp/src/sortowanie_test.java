import java.io.*;
import java.time.Duration;
import java.time.Instant;

public class sortowanie_test {

    public static int[] selectionSort(int[] data){
        int lenD = data.length;
        int j = 0;
        int tmp = 0;
        for(int i=0;i<lenD;i++){
          j = i;
          for(int k = i;k<lenD;k++){
            if(data[j]>data[k]){
              j = k;
            }
          }
          tmp = data[i];
          data[i] = data[j];
          data[j] = tmp;
        }

        Instant end = Instant.now();
        return data;
    }

}
