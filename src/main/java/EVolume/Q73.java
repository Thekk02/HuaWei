package EVolume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 跳房子
 * @date 2024-12-27 10:21:38
 */
public class Q73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        str = str.substring(1,len - 1 );
        int[] nums = Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).toArray();
        int count = sc.nextInt();

        //初始化最小索引和为最大整数值
        int minIdxSum = Integer.MAX_VALUE;
        String ans = "";
        for(int idx1 = 0;idx1 < nums.length;idx1++){
            for(int idx2 = idx1 + 1;idx2 < nums.length;idx2++){
                int step1 = nums[idx1];
                int step2 = nums[idx2];
                if(step1 + step2 == count){
                    int idxSum = idx1 + idx2;
                    if(idxSum < minIdxSum){
                        minIdxSum = idxSum;
                        ans = "[" + step1 + "," + step2 + "]";
                    }
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
