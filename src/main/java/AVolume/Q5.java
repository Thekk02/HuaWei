package AVolume;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author kk
 * @description 查找单入口空闲区域
 * @date 2024-12-5 10:04:56
 */
public class Q5 {
    static int n;
    static int m;
    static String[][] matrix;
    static int[][] offset = {{0,-1},{0,1},{1,0}};
    static HashSet<String> checked = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        matrix = new String[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                matrix[i][j] = sc.next();

            }
        }
        System.out.println();
    }

//    public static String getResult(String[][] matrix,int n ,int m){
//        ArrayList<Integer[]> ans = new ArrayList<>();
//        for(int i = 0;i < n;i++){
//            for(int j = 0;j < m;j++){
//                if("O".equals(matrix[i][j]) && !checked.contains(i + "-" + j)){
//                    ArrayList<Integer[]> enter = new ArrayList<>();
//                    int count = dfs(i,j)
//                }
//            }
//        }
//    }




















}
