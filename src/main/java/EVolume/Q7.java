package EVolume;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author kk
 * @description 查找接口成功率最优时间
 * @date 2024-12-5 14:47:58
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int min = sc.nextInt();
        int[] nums  =Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<String> ans = new ArrayList<>();
        int maxlen = 0;

        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        int temp = nums[0];
        for(int i = 1;i < nums.length;i++){
            temp += nums[i];
            sums[i] = temp;
        }


//        for(int i = 0;i <nums.length;i++){
//            for(int j = i+1;j < nums.length;j++){
//                if(sums[j] - sum[i])
//            }
//        }
    }
}
