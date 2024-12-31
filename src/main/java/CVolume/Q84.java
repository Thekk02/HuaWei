package CVolume;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author kk
 * @description 小明找位置
 * @date 2024-12-28 15:23:25
 */
public class Q84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        int ans = 0;
        for(Integer num : map.keySet()){
            int val = map.get(num);
            if(num == 0){
                ans++;
            }else if(val <= num  + 1){
                ans += num;
            }else{

            }
        }
        System.out.println(ans);
    }
}
