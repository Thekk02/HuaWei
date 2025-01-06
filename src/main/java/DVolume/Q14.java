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
        Integer[] arr = Arrays.stream(sc.nextLine().split(" ")).map(
                p -> {
                    int num = Integer.parseInt(p.substring(0,p.length() - 1));
                    String unit = p.substring(p.length() - 1);
                    return "Y".equals(unit) ? num : num * 7;
                }).toArray(Integer[]::new);
        System.out.println(helper(arr));
    }
    public static int helper(Integer[] arr){
        int ans = 0;
        for(int i = 1;i < arr.length;i++){
            ans += Math.max(0,arr[i] - arr[i - 1]);
        }
        return ans;
    }
}
