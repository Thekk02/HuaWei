package AVolume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 最多获得的短信条数、云平台优惠活动
 * @date 2025-1-1 11:02:44
 */
public class Q109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] p = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        System.out.println(helper(n,p));
    }
    public static int helper(int m,Integer[] p){
        int[] dp = new int[m + 1];
        for(int i = 0;i <= p.length;i++){
            for(int j = 0;j <= m;j++){
                if(i == 0 || j == 0 || j < i){
                    continue;
                }
                dp[j] = Math.max(dp[j],dp[j - 1] + p[i - 1]);
            }
        }
        return dp[m];
    }
}
