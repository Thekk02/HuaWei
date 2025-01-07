package DVolume;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author kk
 * @description 字符串排序
 * @date 2025-1-6 09:50:08
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        System.out.println(helper(strs));
    }
    public static String helper(String[] strs){
        Arrays.sort(strs,(a,b) -> a.toLowerCase().compareTo(b.toLowerCase()) );
        LinkedList<String> stack = new LinkedList<>();
        stack.add(strs[0]);
        for(int i = 1;i < strs.length;i++){
            String s = strs[i];
            String top = stack.getLast().toLowerCase();
            String add = s.toLowerCase();
            if(top.equals(add)){
                continue;
            }
            stack.add(s);
        }
        StringJoiner sj = new StringJoiner(" ");
        for(String s : stack){
            sj.add(s);
        }
        return sj.toString();
    }
}
