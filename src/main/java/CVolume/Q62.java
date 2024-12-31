package CVolume;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author kk
 * @description 求解连续数列
 * @date 2024-12-28 14:45:50
 */
public class Q62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int nSum = n *(n + 1) /2;
        int num = (sum - nSum) / n;
        StringJoiner sj = new StringJoiner(" ");
        for(int i = 1;i <= n;i++){
            sj.add(String.valueOf(num + i));
        }
        System.out.println(sj.toString());
    }

}
