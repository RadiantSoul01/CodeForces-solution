//2167A

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Square {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while(t>0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[4];
            for(int i = 0;i<4;i++){
                a[i] = Integer.parseInt(st.nextToken());
            }

            if(a[0] == a[1] && a[1] == a[2] && a[2] == a[3]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
