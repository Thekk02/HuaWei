package CVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 猴子爬山
 * @date 2024-12-28 11:05:25
 */
public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 3){
            System.out.println(1);
            return;
        }
        if(n == 3){
            System.out.println(2);
            return;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;dp[2] = 1;dp[3] = 2;
        for(int i = 4;i <= n;i++){
            dp[i] = dp[i - 1] + dp[i - 3];
        }
        System.out.println(dp[n]);
    }
}
