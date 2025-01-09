package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 项目排期
 * @date 2024-12-27 11:20:57
 */
public class Q82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(helper(nums,n));
    }
    public static int helper(int[] nums,int n){
        Arrays.sort(nums);
        int low = 0,high = nums.length - 1;
        while(low < high){
            int tmp = nums[low];
            nums[low] = nums[high];
            nums[high] = tmp;
            low++;
            high--;
        }
        int l = nums[0],r = Arrays.stream(nums).sum();
        while(l < r){
            int mid = (l + r) /2;
            if(canFinish(nums,n,mid)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }

    public static boolean canFinish(int[] nums,int k,int limit){
        int[] workers = new int[k];
        return backtrack(nums,workers,0,limit);
    }
    private static boolean backtrack(int[] nums,int[] workers,int index,int limit){
        if(index >= nums.length){
            return true;
        }
        int cur = nums[index];
        for(int i = 0;i < workers.length;i++){
            if(workers[i] + cur <= limit){
                workers[i] += cur;
                if(backtrack(nums,workers,index + 1,limit)){
                    return true;
                }
                workers[i] -= cur;
            }
            if(workers[i] == 0 || workers[i] + cur == limit){
                break;
            }
        }
        return false;
    }
}
