package BVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 路灯照明问题
 * @date 2025-1-1 14:08:54
 */
public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println(0);
            return;
        }
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = sc.nextInt();
        }
        int pre = nums[0];
        int ans = 0;
        for(int i = 1;i < n;i++){
            int kong = 100 - pre -nums[i];
            ans += kong > 0 ? kong : 0;
            pre = nums[i];
        }
        System.out.println(ans);
    }
}
