package EVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 新工号中数字的最小长度
 * @date 2024-12-9 11:29:46
 */
public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int y = sc.nextInt();
        long ans = Math.max(1L,(long)Math.ceil(Math.log10(x/Math.pow(26,y))));
        System.out.println(ans);

    }
}
