package BVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 阿里巴巴找黄金宝箱
 * @date 2024-12-27 14:39:55
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int len = nums.length;
        int[] pre = new int[len];
        pre[0] = 0;
        for(int i = 1;i < len;i++){
            pre[i] = pre[i - 1] + nums[i - 1];
        }
        int sum = pre[len - 1] + nums[len - 1];
        for(int i = 0;i < len;i++){
            if(pre[i] == sum - pre[i] - nums[i]){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
