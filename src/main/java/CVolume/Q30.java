package CVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 滑动窗口最大和
 * @date 2024-12-28 11:05:34
 */
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int sum = 0;
        for(int i = 0;i < m;i++){
            sum += nums[i];
        }
        int ans = sum;
        for(int i = m;i < nums.length;i++){
            sum += nums[i];
            sum -= nums[i - m];
            ans = Math.max(sum,ans);
        }
        System.out.println(ans);
    }
}
