package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 简单的自动曝光像素值
 * @date 2024-12-5 15:28:59
 */
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int len = arr.length;
        long diff = 0;
        for(int i = 0;i < len;i++){
            diff += (128 - arr[i]);
        }


    }
}
