package hw;

import java.util.Scanner;

/**
 * @author kk
 * @description 两数之和绝对值最小
 * @date 2024-12-3 09:03:34
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        int len = strs.length;
        int[] nums = new int[len];
        for(int i = 0;i < len;i++){
            nums[i] = Integer.valueOf(strs[i]);
        }
        int l = 0,r = len - 1;
        int min = Integer.MAX_VALUE;
        while(l < r){
            int sum = nums[l] + nums[r];
            min = Math.min(min,Math.abs(sum));
            if(sum < 0){
                l++;
            }
            if(sum > 0){
                r--;
            }
            if(sum == 0){
                System.out.println(0);
                return;
            }
        }
        System.out.println(min);
    }
}
