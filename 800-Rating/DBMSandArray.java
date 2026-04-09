//2193/A
import java.io.*;
import java.util.*;


public class DBMSandArray {

    private void solve(int[] arr,int x,int s){
        int sum = 0;
        int size = arr.length;
        for(int i = 0;i<size;i++){
            sum = sum + arr[i];
        }
        int required = s - sum;
        if(required < 0){
            System.out.println("NO");
        }else if(required == 0){
            System.out.println("YES");
        }else if(required % x == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
   public static void main(String[] args) throws Exception {
    DBMSandArray obj = new DBMSandArray();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken().trim());

            st = new StringTokenizer(br.readLine());
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            obj.solve(arr,x,s);
        
        }
   }

}
