package DVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 执行时长
 * @date 2025-1-6 08:57:11
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = sc.nextInt();
        int[] nums = new int[len];
        for(int i = 0;i < len;i++){
            nums[i] = sc.nextInt();
        }
        int sheng = 0;
        int time = 0;
        for(int i = 0; i< len;i++){
            time++;
            if(nums[i] + sheng <= n){
                sheng = 0;
            }else{
                sheng = (nums[i] + sheng - n);
            }
        }
        if(sheng == 0){
            System.out.println(time);
            return;
        }else if(sheng < n){
            time++;
        }
        else{
            time += (sheng / n) + 1;
        }
        System.out.println(time);
    }
}
