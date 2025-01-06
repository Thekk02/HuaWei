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
        System.out.println(helper(nums,n));
    }
    public static int helper(int[] nums,int n){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(set.contains(num)){
                break;
            }else{
                list.add(num);
                set.add(num);
            }
        }
        list.sort((a,b) -> a-b);
        int ans = 0;
        if(list.size() < 2 * n){
            return -1;
        }else{
            int l = 0;
            int r = list.size() - 1;
            while(n > 0){
                ans += (list.get(l) + list.get(r));
                l++;
                r--;
                n--;
            }
            return ans;
        }
    }
}
