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
        String s = sc.nextLine();
        System.out.println(helper(k,s));
    }

    public static String helper(int k,String s){
        String[] arr = s.split("-");
        StringJoiner sj = new StringJoiner("-");
        sj.add(arr[0]);
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i < arr.length;i++){
            sb.append(arr[i]);
        }
        String newStr = sb.toString();
        for(int i = 0;i < newStr.length();i++){
            String subStr = newStr.substring(i,Math.min(i + k,newStr.length()));
            sj.add(convert(subStr));
        }
        return sj.toString();
    }


    public static String convert(String str){
        int LowerConut = 0;
        int UpperCount = 0;
        for(int i = 0; i< str.length();i++){
            char c = str.charAt(i);
            if(c >= 'a' && c < 'z'){
                LowerConut++;
            }else if(c >= 'A' && c < 'Z'){
                UpperCount++;
            }
        }
        if(LowerConut > UpperCount){
            return str.toLowerCase();
        }else if(LowerConut < UpperCount){
            return str.toUpperCase();
        }else{
            return str;
        }
    }
}
