package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 预订酒店
 * @date 2024-12-9 11:45:48
 */
public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//数量
        int k = sc.nextInt();//要选的数量
        int x = sc.nextInt();//价钱
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);


    }
}
