package AVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 组装新的数组
 * @date 2025-1-1 10:09:12
 */
public class Q103 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        Integer[] arr = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        int m = sc.nextInt();
        System.out.println(helper(arr,m));

    }
    public static int helper(Integer[] arr,int m){
        Integer[] newArr = Arrays.stream(arr).filter(val -> val <= m).toArray(Integer[]::new);
        return dfs(newArr,0,0,arr[0],m,0);
    }
    public static int dfs(Integer[] arr,int index,int sum,int min,int m,int count){
        if(sum > m){
            return count;
        }
        if(sum == m || (m - sum < min && m - sum > 0)){
            return count + 1;
        }
        for(int i = index;i < arr.length;i++){
            count += dfs(arr,i,sum + arr[i],min,m,count);
        }
        return count;
    }
}
