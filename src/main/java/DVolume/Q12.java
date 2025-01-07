package DVolume;

import sun.plugin.net.protocol.jar.CachedJarURLConnection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringJoiner;

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
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        StringJoiner sj = new StringJoiner(";");
        map.entrySet().stream().sorted( (a,b) ->
                {
                    if(a.getValue() - b.getValue() != 0){
                        return a.getValue() - b.getValue();
                    }else{
                        if((isLower(a.getKey()) && isLower(b.getKey())) || (isUpper(a.getKey()) && isUpper(b.getKey()))){
                            return a.getKey() - b.getKey();
                        }else{
                            if(isUpper(a.getKey())){
                                return 1;
                            }
                            else{
                                return -1;
                            }
                        }
                    }
                }
                ).forEach(entry -> sj.add(entry.getKey() + "" + ":" + entry.getValue() + ""));
        return sj.toString();
    }

    public static boolean isLower(Character ch){
        return ch > 'a' && ch < 'z';
    }
    public static boolean isUpper(Character ch){
        return ch > 'A' && ch < 'Z';
    }

}
