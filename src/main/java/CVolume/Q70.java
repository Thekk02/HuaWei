package CVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 输出指定字母在字符串的中的索引
 * @date 2024-12-28 15:00:01
 */
public class Q70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(str.indexOf(chars[n - 1]));
    }
}
