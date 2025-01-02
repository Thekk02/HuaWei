package BVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 组成最大数
 * @date 2025-1-2 14:04:53
 */
public class Q78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(",");
        Arrays.sort(arr,(a,b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
