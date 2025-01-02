package BVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 字符串摘要
 * @date 2025-1-2 13:59:55
 */
public class Q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        str.replaceAll("[^a-zA-Z]","");
        if(str.length() == 1){
            System.out.println(str);
        }
        char[] strs = str.toCharArray();
        char cur = strs[0];
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i < strs.length;i++){
            if(strs[i] == cur){
                count++;
            }else{

            }
        }
    }
}
