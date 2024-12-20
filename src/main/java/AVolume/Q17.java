package AVolume;

import java.awt.*;
import java.util.Scanner;

/**
 * @author kk
 * @description 回文字符串
 * @date 2024-12-20 14:43:09
 */
public class Q17 {
    public static void main(String[] args) {
        int[] chars = new int[26];
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] strs = str.toCharArray();
        for(int i = 0;i < strs.length;i++){
            chars[strs[i] - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < chars.length;i++){
            if(chars[i] != 0 && chars[i] % 2 == 0){
                for(int j = 0;j < chars[i] / 2;j++){
                    sb.append(i + 'a');
                }
            }
        }
        StringBuilder sbm = new StringBuilder(sb);
        for(int i = 0;i < chars.length;i++){
            if(chars[i] % 2 ==1){
                sbm.append(i + 'a');
                break;
            }
        }
        System.out.println(sbm.append(sb.reverse()).toString());
    }
}
