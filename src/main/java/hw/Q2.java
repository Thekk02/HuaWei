package hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 矩阵元素的边界值
 * @date 2024-12-3 09:03:01
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.substring(2,str.length() - 2).split("],\\[");
        int[][] nums = new int[strs.length][];
        for(int i = 0;i < strs.length;i++){
            String[] numStr = strs[i].split(" ");
            int[] num = new int[numStr.length];
            for(int j = 0;j < num.length;j++){
                num[j] = Integer.valueOf(numStr[j]);
            }
            nums[i] = num;
        }
        if(nums.length == 0|| nums[0].length == 0){
            System.out.println(0);
            return;
        }
        int[] maxnums = nums[0];
        for(int i = 1;i < nums.length;i++){
            for(int j = 0;j < nums[0].length;j++){
                if(nums[i][j] > maxnums[j]){
                    maxnums[j] = nums[i][j];
                }
            }
        }
        System.out.println(Arrays.stream(maxnums).min().getAsInt());

    }
}
