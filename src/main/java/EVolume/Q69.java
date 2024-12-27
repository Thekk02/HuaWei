package EVolume;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author kk
 * @description 九宫格按键输入
 * @date 2024-12-26 11:17:06
 */
public class Q69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,String> char_map = new HashMap<>();
        char_map.put('0'," ");
        char_map.put('1',",.");
        char_map.put('2',"abc");
        char_map.put('3',"def");
        char_map.put('4',"ghi");
        char_map.put('5',"jkl");
        char_map.put('6',"mno");
        char_map.put('7',"pqrs");
        char_map.put('8',"tuv");
        char_map.put('9',"wxyz");
        StringBuilder sb = new StringBuilder();
        int mode = 0;

        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                if(mode == 0){
                    sb.append(c);
                }else if(mode == 1){
                    int j = i;
                    String tempstr = char_map.get(c);
                    while(j < str.length() && str.charAt(j) == c){
                        j++;
                    }
                    int index = (j - i - 1) % tempstr.length();
                    sb.append(tempstr.charAt(index));
                    i = j - 1;
                }
            }else if (c == '#'){
                mode = (mode + 1) % 2;
            }else if(c == '/'){
            }else{
                break;
            }
        }
        System.out.println(sb.toString());
    }
}
