package AVolume;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.TreeSet;

/**
 * @author kk
 * @description 猜字谜
 * @date 2024-12-5 10:01:22
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] mi = str1.split(",");
        String[] di = str2.split(",");
    }

    public static String getResult(String[] issuss,String[] answers){
        ArrayList<String> ans = new ArrayList<>();
        for(String issue : issuss){
            String str1 = getSortedAndDistinctStr(issue);
            boolean find = false;
            for(String answer : answers){
                String str2 = getSortedAndDistinctStr(answer);
                if (str1.equals(str2)) {
                    find = true;
                    break;
                }
            }
            if(!find){
                ans.add("not found");
            }
        }
        StringJoiner sj = new StringJoiner(",","","");
        for(String an : ans){
            sj.add(an);
        }
        return sj.toString();
    }

    public static String getSortedAndDistinctStr(String str){
        TreeSet<Character> set = new TreeSet<>();
        for(char c : str.toCharArray()){
            set.add(c);
        }
        return set.toString();
    }
}
