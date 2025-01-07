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
        int[] wealth = new int[n];
        for(int i = 0; i < n;i++){
            wealth[i] = sc.nextInt();
        }
        int[] family = Arrays.copyOf(wealth,n);
        for(int i = 0;i + 1 < n;i++){
            int fa = sc.nextInt();
            int ch = sc.nextInt();
            family[fa - 1] += wealth[ch - 1];
        }
        System.out.println(Arrays.stream(family).max().orElse(0));
    }
}
