package DVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 分月饼
 * @date 2025-1-6 13:41:08
 */
public class Q31 {
    static int m;
    static int n;
    static int maxDiff = 3;
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m == 1){
            System.out.println(1);
        }else{
            recursive(0,1,n/m,n);
            System.out.println(ans);
        }
    }
    public static void recursive(int level,int min ,int max,int remain){
        if(level == m -1){
            if(remain - min <= maxDiff){
                ans++;
            }
            return;
        }
        for(int i = min;i <= max;i++){
            remain -= i;
            recursive(level + 1,i,Math.min(i + maxDiff,remain / (m - level - 1)),remain);
            remain += i;
        }
    }
}
