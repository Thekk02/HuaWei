package DVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 高效货运
 * @date 2025-1-6 13:55:12
 */
public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wa = sc.nextInt();
        int wb = sc.nextInt();
        int wt = sc.nextInt();
        int pa = sc.nextInt();
        int pb = sc.nextInt();
        int minX = 1;
        int maxX = (wt - wb) /wa;
        int ans = 0;
        for(int x = minX;x <= maxX;x++){
            int remain = wt - wa * x;
            int y = remain / wb;
            ans = Math.max(ans,pa * x + pb * y);
        }
        System.out.println(ans);
    }
}
