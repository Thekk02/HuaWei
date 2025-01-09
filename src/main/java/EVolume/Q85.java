package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 导师请吃火锅
 * @date 2024-12-27 11:23:34
 */
public class Q85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] readyTimes = new int[n];
        for(int i = 0;i < n;i++){
            readyTimes[i] = sc.nextInt() + sc.nextInt();
        }
        Arrays.sort(readyTimes);
        int count =  1;
        int lastTime = readyTimes[0];
        for(int i = 1;i < n;i++){
            if(readyTimes[i] >= lastTime){
                count++;
                lastTime = readyTimes[i];
            }
        }
        System.out.println(count);
    }
}
