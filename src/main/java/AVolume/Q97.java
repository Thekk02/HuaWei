package AVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 寻找符合要求的最长子串
 * @date 2025-1-1 09:45:28
 */
public class Q97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.next();
        System.out.println(helper(s,str.charAt(0)));
    }
    public static int helper(String s,char ex){
        int[] count = new int[128];
        int l = 0,r = 0;
        int ans = 0;

        while(r < s.length()){
            char add_c = s.charAt(r);
            if(ex == add_c){
                ans = Math.max(ans,r - l);
                l = r++;
                Arrays.fill(count,0);
            }else{
                count[add_c]++;
                if(count[add_c] > 2){
                    ans = Math.max(ans,r - l);
                }
                while(count[add_c] > 2){
                    char remove_c = s.charAt(l);
                    count[remove_c]--;
                    l++;
                }
            }
            r++;
        }
        return Math.max(ans,r - l);

    }

}
