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
        int m = sc.nextInt();
        int[] tasks = new int[m];
        for(int i = 0;i < m;i++){
            tasks[i] = sc.nextInt();
        }
        int sheng = 0;
        int ans = 0;
        for(int i = 0;i < m;i++){
            if(tasks[i] <= n){
                if(sheng + tasks[i] <= n){
                    sheng = 0;
                    ans++;
                }else{
                    sheng = (sheng + tasks[i]) - n;
                    ans ++;
                }
            }else{
                sheng += (tasks[i] - n);
                ans++;
            }
        }
        if(sheng % m == 0){
            ans += sheng / m;
            System.out.println(ans);
        }else{
            ans += (sheng / m) + 1;
            System.out.println(ans);
        }
    }
}
