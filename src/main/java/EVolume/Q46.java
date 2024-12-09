package EVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 出租车计费靠谱的车
 * @date 2024-12-9 13:55:33
 */
public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int ans = 0;
        for(char c : line.toCharArray()){
            int digit = c - '0';
            if(digit > 4){
                digit --;
            }
            ans = ans * 9 + digit;
        }
        System.out.println(ans);
    }
}
