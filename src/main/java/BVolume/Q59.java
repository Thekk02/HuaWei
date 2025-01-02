package BVolume;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author kk
 * @description 跳房子1
 * @date 2025-1-2 11:11:04
 */
public class Q59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int[] nums = Arrays.stream(temp.substring(1,temp.length() - 1).split(",")).mapToInt(Integer::parseInt).toArray();

        int count = Integer.parseInt(sc.nextLine());
        System.out.println(helper(nums,count));
    }
    public static String helper(int[] steps,int count){
        HashMap<Integer,Integer> map = new HashMap<>();
        int minIdxSum = Integer.MAX_VALUE;
        String ans = "";
        for(int i = 0;i < steps.length;i++){
            int step1 = steps[i];
            int step2 = count - step1;
            if(map.containsKey(step2)){
                int j = map.get(step2);
                int idxSum = i + j;
                if(idxSum < minIdxSum){
                    minIdxSum = idxSum;
                    ans = "[" + step2 + "," + step1 + "]";
                }
            }else{
                map.putIfAbsent(step1,i);
            }
        }
        return ans;
    }
}
