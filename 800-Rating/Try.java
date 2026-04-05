import java.util.*;

public class Try {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            List<Integer> p = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                p.add(sc.nextInt());
            }

            if (n == 1) {
                System.out.println(1);
            } else {
                for (int i = 0; i < n; i++) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(2);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}