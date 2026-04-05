import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class AsciiArtContest {

    private void result(int[] a){
        if(a[2] - a[0] < 10){
            System.out.println("final " + a[1]);
        }else{
            System.out.println("check again");
        }
    }

    public static void main(String[] args) throws Exception{

        AsciiArtContest obj = new AsciiArtContest();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[3];
        a[0] = Integer.parseInt(st.nextToken());
        a[1] = Integer.parseInt(st.nextToken());
        a[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(a);
        obj.result(a);

    }
    
}
