import java.util.*;
import java.io.*;
public class PerfectRoot {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken().trim());
            for(int i = 1;i<= x;i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
            
    
}
