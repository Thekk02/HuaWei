package EVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 水仙花数1
 * @date 2024-12-9 11:16:12
 */
public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n < 3 | n > 7){
            System.out.println(-1);
            return;
        }
        int count = -1;
        int start = (int)Math.pow(10,n - 1);
        int end = (int)Math.pow(10,n) - 1;

        int num = -1;
        for(int i = start;i <= end;i++){
            if(isShui(i)){
                count++;
                if(count == m){
                    System.out.println(i);
                    return;
                }
                num = i;
            }
        }
        System.out.println(num * m);
    }
    public static boolean isShui(int x){
        int sum = 0;
        int temp = x;
        while(x > 0){
            int b = x % 10;
            sum += b * b * b;
            x /= 10;
        }
        return sum == temp;
    }
}
