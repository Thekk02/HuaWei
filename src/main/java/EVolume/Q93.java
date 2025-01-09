package EVolume;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author kk
 * @description 字母组合过滤组合字符串
 * @date 2024-12-27 14:18:45
 */
public class Q93 {
    static String[] map = {"abc","def","ghi","jkl","mno","pqr","st","uv","wx","yz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] digits = sc.nextLine().toCharArray();
        String filter =sc.nextLine();
        String[] letters = new String[digits.length];
        for(int i = 0;i < digits.length;i++){
            letters[i] = map[digits[i] - '0'];
        }
        StringBuilder sb = new StringBuilder();
        dfs(letters,0,new StringBuilder(),sb,filter,new HashSet());
        System.out.println(sb.toString());

    }
    public static void dfs(String[] letters, int index, StringBuilder path, StringBuilder res, String filter, HashSet<Character> used){
        if(index == letters.length){
            if(!path.toString().contains(filter)){
                res.append(path).append(",");
            }
            return;
        }
        for(int i =0;i < letters[index].length();i++){
            char c = letters[index].charAt(i);
            if(!used.contains(c)){
                path.append(c);
                used.add(c);
                dfs(letters,index + 1,path,res,filter,used);
                path.deleteCharAt(path.length() - 1);
                used.remove(c);
            }
        }

    }
}
