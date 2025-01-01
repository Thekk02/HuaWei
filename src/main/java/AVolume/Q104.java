package AVolume;

import java.util.*;

/**
 * @author kk
 * @description 最差产品奖
 * @date 2025-1-1 10:19:59
 */
public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = Arrays.stream(sc.next().split(",")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i + n <= nums.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j = i ;j < i + n;j++){
                min = Math.min(min,nums[j]);
            }
            ans.add(min);
        }
        StringJoiner sj = new StringJoiner(",");
        for(Integer num : ans){
            sj.add(String.valueOf(num));
        }
        System.out.println(sj.toString());

    }
}
