package CVolume;

import java.util.*;

/**
 * @author kk
 * @description 查找众数及中位数
 * @date 2024-12-28 10:57:10
 */
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) +  1);
        }
        int max = map.values().stream().max((a,b) -> a- b).orElse(0);
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer k : map.keySet()){
            if(map.get(k) == max){
                list.add(k);
            }
        }
        list.sort((a,b) -> a - b);
        int mid = list.size() / 2;
        if(list.size() % 2 == 0){

            System.out.println((list.get(mid) + list.get(mid - 1)) / 2);
        }else{
            System.out.println(list.get(mid));
        }
    }
}
