package DVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 田忌赛马
 * @date 2025-1-6 15:55:51
 */
public class Q58 {
    static int[] a;
    static int[] b;
    static int maxBiggerCount = 0;
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        dfs(0,new boolean[a.length] ,0);
        System.out.println(ans);
    }
    public static void dfs(int level,boolean[] used,int biggerCount){
        if(level >= a.length){
            if(biggerCount > maxBiggerCount){
                maxBiggerCount = biggerCount;
                ans = 1;
            }else if(biggerCount == maxBiggerCount){
                ans++;
            }
            return;
        }
        for(int i = 0;i < a.length;i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            dfs(level + 1,used,biggerCount + (a[i] > b[level] ? 1 : 0));
            used[i] = false;
        }
    }
}
