package AVolume;

import DataStructures.TreeNode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author kk
 * @description 任务总执行时长
 * @date 2024-12-28 11:30:52
 */
public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(helper(nums[0],nums[1],nums[2]));
    }
    public static String helper(int num1,int num2,int num3){
        if(num3 == 0){
            return "[]";
        }
        if(num1 == num2){
            return Arrays.toString(new int[]{num1 * num3});
        }
        TreeSet<Integer> ans = new TreeSet<>();
        for(int i = 0;i <= num3;i++){
            ans.add(num1 * i + num2 * (num3 - i));
        }
        return ans.toString();
    }
}
