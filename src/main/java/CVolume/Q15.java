package CVolume;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kk
 * @description 单词加密
 * @date 2024-12-28 10:58:39
 */
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        for(int i = 0;i < words.length;i++){
            Matcher matcher = Pattern.compile("[aeiouAEIOU]").matcher(words[i]);
            if(matcher.find()){
                words[i] = matcher.replaceAll("*");
            }else{
                char[] arr = words[i].toCharArray();
                char temp = arr[0];
                arr[0] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
                words[i] = new String(arr);
            }
        }
        System.out.println(String.join(" ",words));
    }
}
