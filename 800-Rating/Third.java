import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt(); // always 1

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int p = sc.nextInt(); // special index (1-based)

            int val = a[p - 1];

            int left = 0, right = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] != val) {
                    // start of a new segment
                    if (i == 0 || a[i - 1] == val) {
                        if (i < p - 1) {
                            left++;
                        } else if (i > p - 1) {
                            right++;
                        }
                    }
                }
            }

            int result = 2 * Math.max(left, right);
            System.out.println(result);
        }

        sc.close();
    }
}