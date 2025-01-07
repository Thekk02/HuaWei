package DVolume;

import java.util.*;

/**
 * @author kk
 * @description 最大N个数与最小N个数的和
 * @date 2025-1-6 10:02:35
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = sc.nextInt();
        if(m < 2 * n){
            System.out.println(-1);
        }else{
            System.out.println(helper(nums, n));
        }
    }
    public static int helper(int[] nums,int n){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }else{
                list.add(nums[i]);
                set.add(nums[i]);
            }
        }
        if(list.size() < 2 * n){
            return -1;
        }
        list.sort((a,b) -> a- b);
        int ans = 0;
        for(int i = 0;i < n;i++){
            ans += list.get(i) + list.get(list.size() - 1 -i);
        }
        return ans;
    }

}
