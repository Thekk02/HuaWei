package DVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 最大股票收益
 * @date 2025-1-6 10:14:44
 */
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] prices = Arrays.stream(sc.nextLine().split(" ")).map(p -> {
            int num = Integer.parseInt(p.substring(0,p.length() - 1));
            String unit = p.substring(p.length() - 1);
            return "Y".equals(unit) ? num : num * 7;
        }).toArray(Integer[]::new);
        System.out.println(helper(prices));
    }
    public static int helper(Integer[] prices){
        int ans = 0;
        for(int i = 1;i < prices.length;i++){
            ans += Math.max(prices[i] - prices[i - 1],0);
        }
        return ans;
    }
}
