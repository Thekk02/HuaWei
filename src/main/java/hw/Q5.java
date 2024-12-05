package hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 符合要求的元组的个数
 * @date 2024-12-3 09:04:09
 */
public class Q5 {
    static int[] nums;
    static int k;
    static int target;
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        k = sc.nextInt();
        target = sc.nextInt();
        Arrays.sort(nums);
        dfs(0,0,0);
        System.out.println(ans);
    }
    public static void dfs(int index,long total,int count){
        for(int i = index;i < nums.length;i++){
            if(i > index && nums[i] == nums[i - 1]){
                continue;
            }
            long temp = total + nums[i];
            int tempCount = count + 1;
            if(tempCount == k){
                if(temp == target){
                    ans++;
                }
            }else{
                dfs(i + 1,temp,tempCount);
            }
        }
    }
}
