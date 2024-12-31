package CVolume;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kk
 * @description 表达式括号匹配
 * @date 2024-12-28 10:52:41
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        LinkedList<Character> stack = new LinkedList<>();
        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            if(c != ')' & c != '('){
                continue;
            }
            if(stack.size() > 0 && c == ')'){
                if(stack.getLast() == '('){
                    stack.removeLast();
                    count++;
                }else{
                    System.out.println(-1);
                    return;
                }

            }
            stack.add(c);
        }
        if(stack.size() > 0){
            System.out.println(-1);
            return;
        }
        System.out.println(count);
        return;
    }
}
