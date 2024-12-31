package CVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 找座位
 * @date 2024-12-28 15:43:40
 */
public class Q100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(helper(sc.nextLine().toCharArray()));
    }
    public static int helper(char[] desk){
        int ans = 0;
        for(int i = 0;i < desk.length;i++){
            if(desk[i] == '0'){
                boolean left = i == 0 || desk[i - 1] == '0';
                boolean right = i == desk.length - 1 || desk[i+1] == '0';
                if(left && right){
                    ans++;
                    desk[i] = '1';

                    i++;
                }
            }
        }
        return ans;
    }

}
