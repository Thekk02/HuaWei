package EVolume;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author kk
 * @description 英文输入法
 * @date 2024-12-9 11:37:36
 */
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strs = sc.nextLine();
        String pre = sc.nextLine();
        strs = strs.replaceAll("[^a-zA-Z]"," ");
        Set<String> set = new TreeSet<>();
        String[] str = strs.split("\\s+");
        for(String s : str){
            set.add(s);
        }
        StringBuilder sb = new StringBuilder();
        for(String s : set){
            if(s.startsWith(pre)){
                sb.append(s).append(" ");
            }
        }
        if(sb.length() > 0){
            System.out.println(sb.toString());
        }else{
            System.out.println(pre);
        }
    }
}
