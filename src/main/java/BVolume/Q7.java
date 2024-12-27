package BVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 阿里巴巴找黄金宝箱3
 * @date 2024-12-27 15:55:48
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int num = sc.nextInt();
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++) {
                if(nums[i] == nums[j] && Math.abs(i -j) <= num){
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
