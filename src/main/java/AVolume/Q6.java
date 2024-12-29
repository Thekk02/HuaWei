package AVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 查找重复代码
 * @date 2024-12-5 10:06:03
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println();
    }
    public static String helper(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];
        int max = 0;
        String ans = "";
        for(int i = 1;i < n;i++){
            for(int j = 1;j < m;j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if(dp[i][j] > max){
                        max = dp[i][j];
                        ans = str1.substring(i - max,i);
                    }
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }




}
