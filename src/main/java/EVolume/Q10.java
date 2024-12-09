package EVolume;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author kk
 * @description 第k个排列
 * @date 2024-12-5 14:56:47
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n == 1){
            System.out.println("1");
            return;
        }
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = i + 1;
        }
        List<String> ans = new ArrayList<>();
        get(nums,"",ans,k);
        Collections.sort(ans);
        System.out.println(ans.get(k - 1));
    }
    public static void get(int[] nums,String cur,List<String> res,int k){
        if(nums.length == 0){
            res.add(cur);
            return;
        }
        for(int i = 0;i < nums.length;i++){
            int num = nums[i];
            int[] newNums = new int[nums.length - 1];
            for(int j = 0;j < i;j++){
                newNums[j] = nums[j];
            }
            for(int j = i + 1;j < nums.length;j++){
                newNums[j - 1] = nums[j];
            }
            get(newNums,cur + num,res,k);

            if(res.size() == k){
                return;
            }
        }
    }
}
