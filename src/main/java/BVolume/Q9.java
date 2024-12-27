package BVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 按照单词下标区间翻转文章内容
 * @date 2024-12-27 16:08:55
 */
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int startindex = sc.nextInt();
        int endIndex = sc.nextInt();
        for(int i = startindex,j = endIndex;i<j;i++,j--){
            String temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
        }
        for(int i= 0;i < strs.length;i++){
            System.out.print(strs[i] + " ");
        }
    }
}
