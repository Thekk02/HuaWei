package CVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 密码解密
 * @date 2024-12-28 14:38:49
 */
public class Q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 26;i > 0;i--){
            String key = i + (i > 9 ? "\\*" : "");
            String val = String.valueOf((char) ('a' + i-1));
            str = str.replaceAll(key,val);
        }
        System.out.println(str);
    }
}
