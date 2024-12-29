package AVolume;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author kk
 * @description 对称美学
 * @date 2024-12-20 14:39:50
 */
public class Q14 {
    public static void main(String[] args) {
        String[] strs = new String[64];
        strs[0] = "R";
        for(int i = 1;i < 64;i++){
            strs[i] = NextStr(strs[i - 1]);
        }
        Map<Character,String> map = new HashMap<>();
        map.put('R',"red");
        map.put('B',"blue");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][2];
        for(int i = 0;i < n;i++){
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            System.out.println(strs[nums[i][0]].charAt(nums[i][1]));
        }

    }


    public static String NextStr(String str){
        Map<Character,Character> map = new HashMap<>();
        map.put('R','B');
        map.put('B','R');
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < str.length();i++){
            sb.append(map.get(str.charAt(i)));
        }
        sb.append(str);
        return sb.toString();
    }
}
