package CVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 两数之和绝对值最小
 * @date 2024-12-28 14:26:46
 */
public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                ans = Math.min(ans,Math.abs(nums[i] + nums[j]));
            }
        }
        System.out.println(ans);
    }
}
