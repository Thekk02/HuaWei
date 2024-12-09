package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 分割数组的最大差值
 * @date 2024-12-5 14:57:49
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        for(int i = 0;i < len;i++){
            int num = sc.nextInt();
            nums[i] = num;
        }

        //计算前缀和
        long[] prefix = new long[len];
        prefix[0] = nums[0];
        for(int i = 1;i < len - 1;i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }
        long ans = 0;
        for(int i = 0;i < len - 1;i++){
            long lsum = prefix[i];
            long rsum = prefix[len - 1] - lsum;
            long diff = Math.abs(lsum - rsum);
            ans = Math.max(ans,diff);
        }
        System.out.println(ans);
    }
}
