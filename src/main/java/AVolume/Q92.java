package AVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 上班之路
 * @date 2024-12-31 19:57:29
 */
public class Q92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(helper(s,t,a,b));
    }
    public static int helper(int s,int t,int a,int b){
        int x = 0;
        int diff = t - s;
        while(true){
            if((diff - a *x) % b == 0 || (diff + a * x) % b == 0){
                return Math.abs(x);
            }
            x++;
        }
    }
}
