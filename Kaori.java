//2171/A
import java.io.*;
import java.util.*;

public class Kaori {

    private int count(int n){
        if(n%2 != 0 || n<2){
            return 0;
        }

        int  maxCow = n/4;
        
        return maxCow + 1;
    }

   public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            Kaori girl = new Kaori();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            int way = girl.count(n);
            System.out.println(way);
        
        }
   }
    
}
