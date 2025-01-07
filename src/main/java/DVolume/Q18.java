package DVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 最多购买宝石数目
 * @date 2025-1-6 10:46:48
 */
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            int num = Integer.parseInt(sc.nextLine());
            nums[i] = num;
        }
        int money = Integer.parseInt(sc.nextLine());

        int ans = 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        outer:
        while(r < n){
            sum += nums[r];
            if(sum <= money){
                r++;
            }else{
                ans = Math.max(ans,r - l);
                while(l < r){
                    sum -= nums[l++];
                    if(sum <= money){
                        r++;
                        continue outer;
                    }
                }
                l = ++r;
                sum = 0;
            }
        }
        if(sum <= money){
            ans = Math.max(ans,r - l);
        }
        System.out.println(ans);

    }




}
