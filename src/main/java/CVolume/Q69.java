package CVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 手机App方沉迷系统
 * @date 2024-12-28 14:59:41
 */
public class Q69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(str.indexOf(chars[n - 1]));

    }
}
