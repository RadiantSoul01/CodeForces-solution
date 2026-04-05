import java.util.*;
public class Second {

    public static final long MOD = 676767677;
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();  // #1's
            int y = n - x;         // #(-1)'s
            
            int zeros = (x == y) ? 1 : 0;
            System.out.println(zeros % MOD);
            
            StringBuilder arr = new StringBuilder();
            if(x == y) {
                for(int i = 0; i < n; i++){
                    arr.append((i%2==0) ? "-1 " : "1 ");
                }
            } else if(y > x) {
                for(int i = 0; i < y; i++){
                    arr.append("-1 ");
                }
                for(int i = 0; i < x; i++){
                    arr.append("1 ");
                }
            } else {
                for(int i = 0; i < x; i++){
                    arr.append("1 ");
                }
                for(int i = 0; i < y; i++){
                    arr.append("-1 ");
                }
            }
            System.out.println(arr.toString().trim());
        }
        sc.close();
    }
}