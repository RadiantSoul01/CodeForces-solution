//2201A1-LostCuvilization (easy version)
 /*
 
import java.io.*;
import java.util.*;
 
public class LostCivilization{
 
    private static void secerateCode(int[] arr){
        int total = arr.length;
        int pre = arr[0];
 
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i+1] == arr[i] || 
            arr[i+1] == arr[i] + 1 || 
            (arr[i+1] > pre && arr[i+1] <= arr[i])){
                total--;
            } else {
                pre = arr[i+1];
            }
        }
 
        System.out.println(total);
    }
    public static void main(String[] args)  throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
 
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
 
            secerateCode(arr);
        }
 
    }
}

*/

import java.io.*;
import java.util.*;

public class LostCivilization {

    private static void solve(int[] arr) {
        int n = arr.length;
        int groups = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Pop elements >= arr[i]
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            // If stack empty or top != arr[i]-1, new group
            if (stack.isEmpty() || stack.peek() != arr[i] - 1) {
                groups++;
                stack.clear();
            }
            stack.push(arr[i]);
        }

        System.out.println(groups);
    }

    public static void main(String[] args)  throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            solve(arr);
        }
    }
}