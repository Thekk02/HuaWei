package AVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 等和子数组最小和
 * @date 2024-12-20 14:36:28
 */
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[] arr = new int[num];
        for(int i = 0;i < num;i++){
            arr[i] = sc.nextInt();
        }
    }
}
