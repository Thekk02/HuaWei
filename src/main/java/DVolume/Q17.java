package DVolume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author kk
 * @description 最大时间
 * @date 2025-1-6 10:32:24
 */
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Integer[] arr = Arrays.stream(s.substring(1,s.length() - 1).split(",")).map(Integer::parseInt).toArray(Integer[]::new);

    }

}
