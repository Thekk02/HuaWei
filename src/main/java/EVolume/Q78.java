package EVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 智能驾驶
 * @date 2024-12-27 11:17:21
 */
public class Q78 {
    private static final int MAX_FUEL = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int m = sc.nextInt();
         int n = sc.nextInt();
         int[][] map = new int[m][n];
         for(int i = 0;i < m;i++){
             for(int j = 0;j < n;j++){
                 map[i][j] = sc.nextInt();
             }
         }
         //int minFuel = helper(map,m,n);
        //System.out.println(minFuel);
    }
//    private static int helper(int[][] map,int m,int n){
//        int low = 0,high = MAX_FUEL,optimal = -1;
//        while(low < high){
//            int mid = (low + high) / 2;
//            if()
//        }
//    }
}
