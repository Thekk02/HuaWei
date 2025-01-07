package DVolume;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author kk
 * @description 字符串分割
 * @date 2025-1-6 09:38:16
 */
public class Q10 {
    static int[] fact;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        String[] strs = sc.nextLine().split("-");
        System.out.println(helper(k,strs));
    }
    public static String helper(int k,String[] strs){
        StringJoiner sj = new StringJoiner("-");
        sj.add(strs[0]);
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i < strs.length;i++){
            sb.append(strs[i]);
        }
        for(int i = 0;i < sb.length();i+= k){
            String tmp = sb.substring(i,Math.min(i + k,sb.length()));
            sj.add(convert(tmp));
        }
        return sj.toString();
    }

    public static String convert(String str){
        int low = 0;
        int upper = 0;
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch <= 'z' && ch >= 'a'){
                low++;
            }else if(ch >= 'A' && ch <= 'Z'){
                upper++;
            }
        }
        if(low > upper){
            return str.toLowerCase();
        }else if (low < upper){
            return str.toUpperCase();
        }else{
            return str;
        }
    }

}
