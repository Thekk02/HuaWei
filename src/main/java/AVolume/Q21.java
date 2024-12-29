package AVolume;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author kk
 * @description 积木最远距离
 * @date 2024-12-28 11:22:11
 */
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                max = Math.max(max, i - map.get(nums[i]));
            } else {
                map.put(nums[i], i);
            }
        }
        if(map.size() == n){
            System.out.println(-1);
        }else{
            System.out.println(max);
        }
    }
}
