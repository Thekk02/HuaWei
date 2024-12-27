package BVolume;

import java.util.*;

/**
 * @author kk
 * @description 阿里巴巴找黄金宝箱2
 * @date 2024-12-27 14:47:39
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num : map.values()){
            list.add(num);
        }
        list.sort((a,b) -> b - a);
        int sum = 0,count = 0;
        for(int i = 0;i < list.size();i++){
            count ++;
            sum += list.get(i);
            if(sum >= len - sum){
                System.out.println(count);
                return;
            }
        }
    }
}
