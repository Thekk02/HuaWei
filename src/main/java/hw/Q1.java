package hw;

import java.util.Scanner;

/**
 * @author kk
 * @description 密钥格式化
 * @date 2024-12-3 09:02:25
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.nextLine();
        String[] strs = str.split("-");
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < strs.length;i++){
            sb.append(strs[i]);
        }
    }
}
