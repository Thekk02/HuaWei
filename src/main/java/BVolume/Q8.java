package BVolume;

import javafx.scene.transform.Scale;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 阿里巴巴找黄金宝箱5
 * @date 2024-12-27 16:01:42
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();
        int sum = 0;
        for(int i = 0;i < k;i++){
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i = k;i < nums.length;i++){
            sum += nums[i];
            sum -= nums[i - k];
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println(maxSum);
    }
}
