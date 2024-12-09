package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 日志采集系统
 * @date 2024-12-9 14:12:45
 */
public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int len = nums.length;
        if(len == 1){
            System.out.println(nums[0]);
            return;
        }
        int[] score = new int[len];
        int pre = nums[0];
        score[0] = pre;
        for(int i = 1;i < len;i++){
            for(int j = 0;j < i;j++){
                score[i] += (i - j)*nums[j];
            }
            score[i] += nums[i];
        }
        Arrays.sort(score);
        System.out.println(score[len - 1]);
    }
}
