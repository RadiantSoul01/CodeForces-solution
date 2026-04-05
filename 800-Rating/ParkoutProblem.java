import java.io.*;
import java.util.*;

public class ParkoutProblem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            long diff = x - 2*y;

            if (diff % 3 != 0) {
                System.out.println("NO");
                continue;
            }

            long k = diff / 3;

            if (k >= 0 && k >= 2 * (-y)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}