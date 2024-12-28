package CVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 灰度图存储
 * @date 2024-12-28 14:02:02
 */
public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int i = sc.nextInt(),j = sc.nextInt();
        int[] matrix = new int[nums[0] * nums[1]];
        int sum = 0;
        for(int k = 2;k + 1 < nums.length;k+=2){
            int temp = nums[k];
            for(int l = sum;l < sum + nums[k + 1];l++){
                matrix[l] = temp;
            }
            sum += nums[k + 1];
        }
        System.out.println(matrix[i * nums[0] + j]);
    }
}
