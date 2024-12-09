package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 爱吃蟠桃的孙悟空
 * @date 2024-12-9 13:36:55
 */
public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] peachs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int time = sc.nextInt();
        int n = peachs.length;
        if (n == 0 || time <= 0 || n >= 10000 || time >= 10000 || n > time) {
            System.out.println(0);
            return;
        }
        int left = 1, right = (int) 1e9;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEat(peachs, time, mid)) {
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(left);

        //判断能否吃完
    }
    public static boolean canEat(int[] p,int h,int k){
        int ans = 0;
        for(int x : p){
            ans += Math.ceil(x * 1.0 / k);
        }
        return ans <= h;

    }
}
