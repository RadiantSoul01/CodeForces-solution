//2162A
import java.io.*;
import java.util.*;

public class BeautiFulAverage{
    private void avg(int[] arr,int n){
        int max = arr[0];
        for(int i = 1;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
   public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BeautiFulAverage obj = new BeautiFulAverage();
            int n = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            obj.avg(arr,n);
        
        }
   }
    
}
