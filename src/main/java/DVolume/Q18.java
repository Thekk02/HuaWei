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
        int n = sc.nextInt();
        int[] gems = new int[n];
        for(int i = 0;i < n;i++){
            gems[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int ans = 0;
        int l = 0;
        int r = 0;
        int window_sum = 0;
        outer:
        while(r < n){
            window_sum += gems[r];
            if(window_sum <= v){
                r++;
            }else{
                ans = Math.max(ans,r - l);
                while(l < r){
                    window_sum -= gems[l++];
                    if(window_sum <= v){
                        r++;
                        continue outer;
                    }
                }
                l = ++r;
                window_sum = 0;
            }
        }
        if(window_sum <= v){
            ans = Math.max(ans,r - l);
        }
        System.out.println(ans);
    }

}
