package BVolume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 找终点
 * @date 2025-1-2 13:08:44
 */
public class Q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        System.out.println(helper(arr));
    }
    public static  int helper(Integer[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 1;i < arr.length / 2;i++){
            res.add(loop(arr,i,2));
        }
        return res.stream().filter(ele -> ele > 0).min((a,b) -> a- b).orElse(-1);
    }
    public static int loop(Integer[] arr,int i,int count){
        int j = i + arr[i];
        if(j == arr.length - 1){
            return count;
        }else if(j < arr.length - 1){
            count++;
            return loop(arr,j,count);
        }else{
            return -1;
        }
    }
}
