package CVolume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author kk
 * @description 查找接口成功率最优时间段
 * @date 2024-12-28 10:56:47
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.parseInt(sc.nextLine());
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(helper(nums,min));
    }
    public static String helper(int[] nums,int min){
        int n = nums.length;
        int[] preSum = new int[n + 1];
        for(int i = 1;i <= n;i++){
            preSum[i] = preSum[i - 1] +nums[i - 1];
        }
        ArrayList<int[]> ans = new ArrayList<>();
        int maxlen = 0;
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                int sum = preSum[j] - preSum[i];
                int len = j - i;
                int lost = len * min;
                if(sum <= lost){
                    if(len >= maxlen){
                        if(len > maxlen){
                            ans = new ArrayList<>();
                        }
                        ans.add(new int[]{i,j - 1});
                        maxlen = len;
                    }
                }
            }
        }
        if(ans.size() == 0){
            return "NULL";
        }
        ans.sort((a,b) -> a[0] - b[0]);
        StringJoiner sj = new StringJoiner(" ");
        for(int[] an: ans){
            sj.add(an[0] + "-" + an[1]);
        }
        return sj.toString();
    }
}
