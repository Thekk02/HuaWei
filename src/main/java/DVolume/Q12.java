package DVolume;

import sun.plugin.net.protocol.jar.CachedJarURLConnection;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author kk
 * @description 字符统计及重排
 * @date 2025-1-6 09:51:04
 */
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(helper(s));
    }
    public static String helper(String s){
        HashMap<Character,Integer> letter = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            letter.put(s.charAt(i),letter.getOrDefault(s.charAt(i),0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        letter.entrySet().stream().sorted(
                (a,b) -> {
                    if(a.getValue() - b.getValue() != 0){
                        return b.getValue() - a.getValue();
                    }else{
                        if((isLower(a.getKey()) && isLower(b.getKey())) || (isUpper(a.getKey()) && isUpper(b.getKey()))){
                            return a.getKey() - b.getKey();
                        }else{
                            if(isUpper(a.getKey())){
                                return 1;
                            }else{
                                return -1;
                            }
                        }
                    }
                }
        ).forEach(entry -> sb.append(entry.getKey() + ":" + entry.getValue() + ";"));
        return sb.toString();
    }

    public static boolean isLower(char letter){
        return letter >= 'a' && letter <= 'z';
    }
    public static boolean isUpper(char letter){
        return letter >= 'A' && letter <= 'Z';
    }
}
