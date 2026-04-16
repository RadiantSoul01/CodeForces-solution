//2218C
import java.util.*;
public class PermutationProb {


    private static void result(int n){
        int arr[] = new int[3*n];
        int min = 1;
        int max = n*3;
        for(int i = 0;i<3*n;i = i+3){
            arr[i] = min++;
            arr[i+1] = max--;
            arr[i+2] = max--;
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {

            int n = sc.nextInt();  
            sc.nextLine();    
            result(n);
            
        }
    }
}
