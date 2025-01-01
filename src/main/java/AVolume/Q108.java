package AVolume;

import java.util.*;

/**
 * @author kk
 * @description 最多等和不相交连续子序列
 * @date 2025-1-1 10:48:55
 */
public class Q108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(helper(arr,n));
    }
    public static int helper(int[] arr,int n){
        HashMap<Integer, ArrayList<Integer[]>> ranges = new HashMap<>();

        int[] dp = new int[n];
        dp[0] = arr[0];
        for(int i = 1;i < arr.length;i++){
            dp[i] = dp[i - 1] + arr[i];
        }
        for(int i = 0;i < n;i++){
            for(int j = i;j < n;j++){
                if(i == 0){
                    int sum = dp[j];
                    ranges.putIfAbsent(sum,new ArrayList<>());
                    ranges.get(sum).add(new Integer[]{0,j});
                }else{
                    int sum = dp[j] - dp[i - 1];
                    ranges.putIfAbsent(sum,new ArrayList<>());
                    ranges.get(sum).add(new Integer[]{i,j});
                }
            }
        }
        int max = 0;
        for(Integer key : ranges.keySet()){
            ArrayList<Integer[]> range = ranges.get(key);
            max = Math.max(max,disjoint(range));
        }
        return max;

    }

    //求不先交区间的最大个数
    public static int disjoint(ArrayList<Integer[]> ranges){
        int count = 1;
        ranges.sort((a,b) -> a[1] - b[1]);
        Integer t = ranges.get(0)[1];
        for(int i = 1;i < ranges.size();i++){
            Integer[] range = ranges.get(i);
            Integer l = range[0];
            Integer r = range[1];
            if(t < l){
                count++;
                t = r;
            }
        }
        return count;
    }
}
