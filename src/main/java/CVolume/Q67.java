package CVolume;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author kk
 * @description 全排列
 * @date 2024-12-28 14:52:41
 */
public class Q67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int ans = getFact(len);

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < len;i++){
            char c = str.charAt(i);
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for(Character c : map.keySet()){
            int n = map.get(c);
            if(n > 1){
                ans /= getFact(n);
            }
        }
        System.out.println(ans);
    }

    public static int getFact(int n){
        int ans = 1;
        for(int i = 1;i <= n;i++){
            ans *= i;
        }
        return ans;
    }
}
