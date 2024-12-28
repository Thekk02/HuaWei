package BVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 分割数组的最大差值
 * @date 2024-12-28 09:40:39
 */
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        for(int i =0 ;i < n;i++){
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        int maxans = 0;
        int[] temp = new int[n];
        temp[0] = nums[0];
        maxans = Math.max(maxans,Math.abs(sum - temp[0] - temp[0]));
        for(int i = 1;i < n;i++){
            temp[i] = temp[i - 1] + nums[i];
            maxans = Math.max(maxans,Math.abs(sum - temp[i] - temp[i]));
        }
        System.out.println(maxans);
    }
}
