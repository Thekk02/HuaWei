package DVolume;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kk
 * @description 最大括号深度
 * @date 2025-1-6 10:24:22
 */
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(helper(s));
    }
    public static int helper(String s){
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        LinkedList<Character> stack = new LinkedList<>();
        int ans = 0;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(stack.size() > 0 && map.get(c) == stack.getLast()){
                stack.removeLast();
            }else{
                stack.add(c);
                ans = Math.max(ans,stack.size());
            }
        }
        if(stack.size() > 0){
            return 0;
        }
        return ans;
    }

}
