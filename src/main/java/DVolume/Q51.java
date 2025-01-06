package DVolume;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author kk
 * @description 抢7游戏
 * @date 2025-1-6 15:17:21
 */
public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        BigInteger[] dpA = new BigInteger[m + 2];
        for(int i = 0;i < m +2;i++){
            dpA[i] = new BigInteger("0");
        }
        dpA[m] = new BigInteger("1");
        BigInteger[] dpB = new BigInteger[m + 2];
        for(int i = 0;i < m + 2;i++){
            dpB[i] = new BigInteger("0");
        }
        for(int i = m -1;i >= 7;i--){
            dpB[i] = dpA[i +1].add(dpA[i + 2]);
            dpA[i] = dpB[i + 1].add(dpB[i + 2]);
        }
        System.out.println(dpB[7]);
    }
}
