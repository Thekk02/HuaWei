package CVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 小明的幸运数
 * @date 2024-12-28 15:23:07
 */
public class Q83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int luck = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = sc.nextInt();
        }
        int ans = 0;
        int pos = 0;
        for(int i =0;i < n;i++){
            int step = nums[i];
            if(Math.abs(step) == luck){
                if(step > 0){
                    step++;
                }else{
                    step--;
                }
            }
            pos += step;
            ans = Math.max(ans,pos);


        }
        System.out.println(ans);
    }
}
