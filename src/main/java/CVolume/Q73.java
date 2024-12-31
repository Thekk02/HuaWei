package CVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 数字字符串倒序
 * @date 2024-12-28 15:03:36
 */
public class Q73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(helper(n,x,nums));
    }
    public static long helper(int n,int x,int[] arr){
        int[] pre = new int[n + 1];
        for(int i = 1;i <= n;i++){
            pre[i] = pre[i - 1] + arr[i - 1];;
        }
        int l = 0;
        int r = l;
        long ans = 0;
        while(r <= n){
            if(pre[r] - pre[l] >= x){
                ans += n - r + 1;
                l++;
                r = l + 1;
            }else{
                r++;
            }
        }
        return ans;
    }
}
