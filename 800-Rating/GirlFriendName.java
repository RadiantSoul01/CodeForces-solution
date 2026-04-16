import java.util.*;

public class GirlFriendName {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {

            int n = sc.nextInt();  
            sc.nextLine();        

            String name = sc.nextLine();
            String[] parts = name.split(" ");

            String first = parts[0];
            String second = parts[1];

            if(first.length() == second.length()){
                int[] arr = new int[26];

                for(int i = 0; i < first.length(); i++){
                    arr[first.charAt(i) - 'a']++;
                    arr[second.charAt(i) - 'a']--;
                }

                boolean same = true;
                for(int i = 0; i < 26; i++){
                    if(arr[i] != 0){
                        same = false;
                        break;
                    }
                }

                if(same){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}