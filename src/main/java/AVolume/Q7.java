package AVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 称砝码
 * @date 2024-12-20 14:13:14
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n + 1];
        for(int i = 1;i <= n;i++){
            m[i] = sc.nextInt();
        }
        int[] x = new int[n + 1];
        for(int i = 1;i <= n;i++){
            x[i] = sc.nextInt();
        }
        System.out.println(helper(n,m,x));
    }

    public static int helper(int n,int[] m,int[] x){
        int bag = 0;
        for(int i = 0;i <= n;i++){
            bag += m[i] * x[i];
        }
        boolean[] dp = new boolean[bag + 1];
        dp[0] = true;
        for(int i = 1;i <= n;i++){
            for(int j = bag;j >= m[i];j--){
                for(int k = 1;k <= x[i];k++){
                    if(j >= m[i] * k){
                        if(dp[j - m[i] * k]){
                            dp[j] = true;
                        }
                    }
                }
            }
        }
        int count = 0;
        for(boolean flag : dp){
            if(flag){
                count++;
            }
        }
        return count;
    }

}
