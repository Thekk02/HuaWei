package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 最少交换次数
 * @date 2024-12-9 13:14:12
 */
public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int[] nums = Arrays.stream(strs).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();

        int count = 0;
        for(int num : nums){
            if(num < k){
                count++;
            }
        }
        if(count < 2){
            System.out.println(0);
            return;
        }
        int ans = 0;
        for(int i = 0;i < count;i++){
            if(nums[i] >= k){
                ans++;
            }
        }
        int tempans = ans;
        for(int i = count;i < nums.length;i++){
            int preleft = i - count;
            int curright = i;
            if(nums[preleft] >= k && nums[curright] < k){
                tempans--;
            }else if(nums[preleft] < k && nums[curright] >= k){
                tempans++;
            }
            ans = Math.min(ans,tempans);
        }
        System.out.println(ans);
    }
}
