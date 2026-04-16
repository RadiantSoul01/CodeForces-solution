import java.util.*;

public class FlipFlop {
    private static long max(int[] arr,long c,long k){

        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i] <= c){
                long gap = (long)(c - arr[i]);
                if(k != 0){
                    if(k <= gap){
                        c = arr[i] + c + k;
                        k = 0;
                    }else{
                        c = arr[i] + c + gap;
                        k = k - gap;
                    }
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long max = max(arr,c,k);
            System.out.println(max);
        }
    }
}