package BVolume;

import com.sun.imageio.plugins.common.I18N;
import javafx.scene.transform.Scale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kk
 * @description 最少面试官数
 * @date 2025-1-4 15:53:40
 */
public class Q134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] ranges = new int[n][2];
        for(int i = 0;i < n;i++){
            ranges[i][0] = sc.nextInt();
            ranges[i][1] = sc.nextInt();
        }
        System.out.println(helper(m,n,ranges));
    }
    public static long helper(int m,int n,int[][] ranges){
        Arrays.sort(ranges,(a,b) -> a[1] - b[1]);
        ArrayList<LinkedList<Integer>> buckets = new ArrayList<>();
        for(int i = 0;i < n;i++){
            buckets.add(new LinkedList<>());
        }
        for(int[] range : ranges){
            int s = range[0];
            int e = range[1];
            for(LinkedList<Integer> bucket : buckets){
                if(bucket.size() < m && (bucket.size() == 0 || bucket.getLast() <= s)){
                    bucket.add(e);
                    break;
                }
            }
        }
        return buckets.stream().filter(bucket -> bucket.size() > 0).count();
    }
}
