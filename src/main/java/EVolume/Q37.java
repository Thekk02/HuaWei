package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 最大值
 * @date 2024-12-9 13:04:45
 */
public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        Arrays.sort(str,(a,b)->{
            String zheng = a + b;
            String fan = b + a;
            return fan.compareTo(zheng);
        });
        StringBuilder sb = new StringBuilder();
        for(String s : str){
            sb.append(s);
        }
        int len = sb.length();
        int k = 0;
        while(k < len - 1 && sb.charAt(k) == '0'){
            k++;
        }
        System.out.println(sb.substring(k));

    }
}
