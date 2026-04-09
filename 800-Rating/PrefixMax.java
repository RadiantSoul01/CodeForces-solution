import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrefixMax {

    private int max(int[] arr){
        int max = arr[0];

        for(int a : arr){
            if(a > max){
                max = a;
            }
        }
        return max;
    }

   public static void main(String[] args) throws Exception {
    PrefixMax obj = new PrefixMax();
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
            int m = obj.max(arr);
            System.out.println(m*n);
        
        }
   }
    
}
