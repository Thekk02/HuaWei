package AVolume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author kk
 * @description 猜数字
 * @date 2024-12-5 10:00:16
 */
public class Q2 {
    static String[][] infos;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        infos = new String[n][2];
        for(int i = 0;i < n;i++){
            infos[i][0] = sc.next();
            infos[i][1] = sc.next();
        }
        System.out.println();
    }

}
