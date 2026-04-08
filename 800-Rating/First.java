import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }

            // This game: each move decrements by exactly 1 → total moves = sum(a)
            // Shaunak wins without special if sum is odd (he makes the last move)
            // Shaunak can use special move (even on turn 1) → resets to n*k total moves, Yash goes next
            // Shaunak wins after special if n*k is even
            // Shaunak wins if EITHER condition holds
            if (sum % 2 == 1 || (n * k) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}