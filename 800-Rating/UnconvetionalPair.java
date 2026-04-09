//2149/B
import java.io.*;
import java.util.*;

public class UnconvetionalPair {

   public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            int max = Integer.MIN_VALUE;
            for(int i = 0;i<n/2;i++){
                max = Math.max(max, arr[i*2+1] - arr[i*2]);
            }

            System.out.println(max);
        
        }
   }
    
}
