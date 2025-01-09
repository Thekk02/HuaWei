package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 云短信平台优惠活动
 * @date 2024-12-27 11:02:56
 */
public class Q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = Integer.parseInt(sc.nextLine());
        int[] topupinfo = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[money + 1];
        for(int i = 0;i < topupinfo.length;i++){
            for(int j = i + 1;j <= money;j++){
                dp[j] = Math.max(dp[j],dp[j - (i + 1)] + topupinfo[i]);
            }
        }
        System.out.println(dp[money]);
    }
}
