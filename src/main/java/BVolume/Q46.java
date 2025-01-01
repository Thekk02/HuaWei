package BVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 求最小步数
 * @date 2025-1-1 15:03:13
 */
public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(helper(n));

    }
    public static int helper(int n){
        if(n == 1){
            return 2;
        }
        if(n == 2 || n == 3){
            return 1;
        }
        int base = 2;
        return (n -4) /3 + base;
    }
}
