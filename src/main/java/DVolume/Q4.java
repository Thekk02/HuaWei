package DVolume;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author kk
 * @description 整型数组按个位值排序
 * @date 2024-12-20 15:05:25
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(",");
        Arrays.sort(strs,(a,b) -> a.charAt(a.length() - 1) - b.charAt(b.length() - 1));
        StringJoiner sj = new StringJoiner(",");
        for(String str : strs){
            sj.add(str);
        }
        System.out.println(sj.toString());

    }
}
