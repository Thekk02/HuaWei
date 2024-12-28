package CVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 停车场车辆统计
 * @date 2024-12-28 15:13:54
 */
public class Q79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replaceAll(",","").replaceAll("111","x").replaceAll("11","x").replaceAll("1","x");
        int ans = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == 'x'){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
