package DVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description Wonderland
 * @date 2025-1-6 11:35:07
 */
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] costs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] days = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxDay = days[days.length - 1];
        int[] dp = new int[maxDay];
        int index = 0;
        for(int i = 0;i < maxDay;i++){
            if(i == days[index]){
                int buy1 = dp[i -1] + costs[0];
                int buy3 = (i >= 3 ? dp[i -3] : 0) + costs[1];

                int buy7 = (i >=7 ? dp[i -7] : 0) + costs[2];

                int buy30 = (i >= 30 ? dp[i -30] : 0) + costs[3];

                dp[i] = Math.min(buy30,Math.min(buy7,Math.min(buy1,buy3)));

                index++;
            }else{
                dp[i] = dp[i -1];
            }
        }
        System.out.println(dp[maxDay]);
    }
}
