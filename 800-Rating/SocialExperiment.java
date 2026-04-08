//2184/A

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SocialExperiment {

    private static void diff(int n){
        if(n<=3){
            System.out.println(n);
        }else{
            System.out.println(n%2 == 0 ? 0 : 1);
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            diff(n);
        }
  
    }
    
}

//explanation 
/*
    for the first three there is only one group passible so the they should be group;
    since no other group exist so the minn diff is tthe element in the group;
    i.e,if 2 then 2 or 3 if the member is three

    now for freater than 3 there is a case;
    if a number is 4 lets say then we can minimise the diff by taking two group of 2 ,2 member;
    which result the min diff to be 0;
    now for 5 we do the same min the group by makin group of 3,2 - > 1 answer
    now for 6 we 3,3 or 2,2,2 -> 0
    for 7 we got 3,3 -> 1 or 3 ,2,2 -> 1 either way answer 1;
    for 8 we got 3,3,2 - > 1 but min diff 2,2,2 -> 0;

    we see a pattern after n > 3
    for even number answer 0
    for off number answer 1

    so insteed of simulating each scenario ,we will simply check if the number is even or odd
    
*/