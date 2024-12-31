package CVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 单词重量
 * @date 2024-12-28 10:59:31
 */
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        int len = words.length;
        double sum = 0;
        for(int i = 0;i < len;i++){
            sum += words[i].length();
        }
        System.out.println(String.format("%.2f",sum / len).toString());
    }
}
