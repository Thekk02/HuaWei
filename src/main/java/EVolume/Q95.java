package EVolume;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kk
 * @description 最长方连续方波信号
 * @date 2024-12-27 14:19:21
 */
public class Q95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String signal = sc.nextLine();
        Pattern pattern = Pattern.compile("^(01)+0$");

        int maxLength = 0;
        String ans = "-1";
        StringBuilder sb = new StringBuilder();
        for(char c : signal.toCharArray()){
            if(c == '0' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '0'){
                Matcher matcher = pattern.matcher(sb.toString());
                if(matcher.find() && sb.length() > maxLength){
                    maxLength = sb.length();
                    ans = sb.toString();
                }
            }
            sb.append(c);
        }
        Matcher matcher = pattern.matcher(sb.toString());
        if(matcher.find() && sb.length() > maxLength){
            ans = sb.toString();
        }
        System.out.println(ans);
    }
}
