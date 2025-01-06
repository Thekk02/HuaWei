package Learning;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author kk
 * @description 阿里巴巴找黄金宝箱
 * @date 2025-1-3 13:28:05
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] ans = Arrays.copyOf(nums,nums.length);
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[j] > nums[i]){
                    ans[i] = nums[j];
                    break;
                }
            }
            if(ans[i] == nums[i]){
                ans[i] = -1;
            }
        }

        StringJoiner sj = new StringJoiner(",");
        for(int i = 0;i < nums.length;i++){
            sj.add(String.valueOf(ans[i]));
        }
        System.out.println(sj.toString());
    }
}
