package CVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 求符合要求的结对方式
 * @date 2024-12-28 14:44:43
 */
public class Q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];
        for(int i = 0;i < num;i++){
            nums[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        System.out.println(helper(nums,n));

    }
    public static int helper(int[] arr,int n){
        Arrays.sort(arr);
        int ans = 0;
        for(int i = 0;i < arr.length;i++){
            for(int j = arr.length - 1;j > i;j--){
                int sum = arr[i] + arr[j];
                if(sum == n){
                    ans++;
                }else if(sum < n){
                    break;
                }
            }
        }
        return ans;
    }
}
