package DVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 最富裕的小家庭
 * @date 2025-1-6 10:53:21
 */
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] wealth = new long[n + 1];
        long[] family = new long[n + 1];
        for(int i = 1;i <= n;i++){
            wealth[i] = sc.nextInt();
            family[i] = wealth[i];
        }
        for(int i  =0 ;i < n - 1;i++){
            int fa = sc.nextInt();
            int ch = sc.nextInt();
            family[fa] += wealth[ch];
        }
        System.out.println(Arrays.stream(family).max().orElse(0));
    }
}
