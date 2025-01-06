package DVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 字符串比较
 * @date 2025-1-6 16:37:59
 */
public class Q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int v = sc.nextInt();
        System.out.println(helper(a,b,v));
    }
    public static int helper(String a,String b,int v){
        int n = a.length();
        int[] preSum = new int[n + 1 ];
        for(int i = 1;i < n;i++){
            preSum[i] = preSum[i - 1] + Math.abs(a.charAt(i) - b.charAt(i));
        }
        int ans = 0;
        for(int l = 0;l <= n - 1;l++){
            for(int r = l + 1;r <= n - 1;r++){
                if(preSum[r] - preSum[l] <= v){
                    ans = Math.max(ans,r - l);
                }
            }
        }
        return ans;
    }
}
