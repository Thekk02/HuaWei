package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 补种未成活胡杨
 * @date 2024-12-5 14:29:05
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();

        int dead  =sc.nextInt();

        int[] trees = new int[total];

        Arrays.fill(trees,0);

        for(int i = 0;i < dead;i++){
            int num = sc.nextInt();
            trees[num - 1] = 1;
        }

        int bu = sc.nextInt();

        int left = 0;
        int maxlen = 0;
        int lsum = 0;
        int rsum = 0;
        for(int right = 0;right < total;right++){
            rsum += trees[right];
            while(rsum - lsum > bu){
                lsum += trees[left];
                left++;
            }
            maxlen = Math.max(maxlen,right - left + 1);
        }
        System.out.println(maxlen);
    }
}
