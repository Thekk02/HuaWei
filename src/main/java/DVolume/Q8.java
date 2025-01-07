package DVolume;

import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author kk
 * @description 转盘寿司
 * @date 2025-1-6 09:22:46
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prices = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int len = prices.length;
        int[] nums = new int[len];
        for(int i = 0;i <len;i++){
            nums[i] = prices[i];
            for(int j = i;j < 2 * len;j++){
                if(prices[j % len] < prices[i]){
                    nums[i] += prices[j % len];
                    break;
                }
            }
        }
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
