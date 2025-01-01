package BVolume;

import sun.java2d.pipe.SpanClipRenderer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 乱序整数序列两数之和绝对值最小
 * @date 2025-1-1 14:15:08
 */
public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] ans = new int[3];
        ans[2] = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(Math.abs(nums[i] + nums[j]) < ans[2]){
                    ans[0] = nums[i];
                    ans[1] = nums[j];
                    ans[2] = Math.abs(nums[i] + nums[j]);
                }
            }
        }
        System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
    }
}
