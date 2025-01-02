package BVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 生日礼物
 * @date 2025-1-2 08:44:29
 */
public class Q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[] cakes = Arrays.stream(sc.nextLine().replaceAll("[\\[\\]]","").split(",")).mapToInt(Integer::parseInt).toArray();
         int[] gifts = Arrays.stream(sc.nextLine().replaceAll("[\\[\\]","").split(",")).mapToInt(Integer::parseInt).toArray();

         int x = Integer.parseInt(sc.nextLine());
        System.out.println();
    }
//    public static long helper(int[] cakes,int[] gifts,int x){
//        Arrays.sort(cakes);
//        long ans = 0;
//        for(int gift : gifts){
//            if(x <= gift){
//                continue;
//            }
//            int maxCake = x -gift;
//
//        }
//    }
}
