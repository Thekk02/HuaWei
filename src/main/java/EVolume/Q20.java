package EVolume;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kk
 * @description 简易压缩算法
 * @date 2024-12-6 09:15:01
 */
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String pat = "[^0-9a-z]";
        String num = "";
        String res = "";
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(str);

        if(matcher.find()){
            res = "!error";
        }else{
            for(int i = 0;i < str.length();i++){
                char c = str.charAt(i);
                if(Character.isDigit(c)){
                    num += c;
                }else if(!num.equals("")){
                    if(Integer.parseInt(num) <= 2){
                        res = "!error";
                        break;
                    }else{
                        for(int j = 0;j < Integer.parseInt(num);j++){
                            res += c;
                        }
                        num = "";
                    }
                }else{
                    res += c;
                }
            }
        }
        System.out.println(res);
    }
}
