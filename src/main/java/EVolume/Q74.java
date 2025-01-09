package EVolume;

import java.util.*;

/**
 * @author kk
 * @description 跳格子3
 * @date 2024-12-27 10:32:30
 */
public class Q74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(sc.nextLine());
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i = 1;i < n;i++){
            int diff = Math.max(0,i - k);
            int diffnum = Integer.MIN_VALUE;
            for(int j = 0;j <= diff;j++){
                diffnum = Math.max(diffnum,nums[i - j]);
            }
            dp[i] = nums[i] + diffnum;
        }
        System.out.println(Arrays.stream(dp).max().orElse(0));

    }
}
