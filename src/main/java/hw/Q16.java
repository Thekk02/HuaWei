package hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 生日礼物
 * @date 2024-12-3 09:23:57
 */
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cakes = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] gifts = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int money = sc.nextInt();
        int ans = 0;
        for(int i = 0;i < cakes.length;i++){
            for(int j = 0;j < gifts.length;j++){
                if(cakes[i] + gifts[j] <= money){
                    ans++;
                }
            }

        }
        System.out.println(ans);
    }
}
