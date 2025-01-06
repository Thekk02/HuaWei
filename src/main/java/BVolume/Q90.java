package BVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 查字典
 * @date 2025-1-4 10:28:29
 */
public class Q90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pre = sc.next();
        boolean find = false;
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            String word = sc.next();
            if(word.startsWith(pre)){
                find = true;
                System.out.println(word);
            }
        }
    if(!find){
        System.out.println(-1);
    }
    }
}
