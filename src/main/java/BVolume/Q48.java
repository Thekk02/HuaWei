package BVolume;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Pattern;

/**
 * @author kk
 * @description 热点网站统计
 * @date 2025-1-2 08:23:38
 */
public class Q48 {
    //用于判断一个字符是否为正整数
    static Pattern reg = Pattern.compile("^\\d+$");
    static HashMap<String,Integer> cache = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String tmp = sc.nextLine();
            if(reg.matcher(tmp).find()){
                System.out.println(helper(Integer.parseInt(tmp)));
            }else{
                cache.put(tmp,cache.getOrDefault(tmp,0) + 1);
            }
        }
    }
    public static String helper(int n){
        StringJoiner sj = new StringJoiner(",");
        cache.entrySet().stream().sorted((a,b) -> Objects.equals(a.getValue(),b.getValue()) ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue()).limit(n).map(ele -> ele.getKey()).forEach(url -> sj.add(url));
        return sj.toString();
    }
}
