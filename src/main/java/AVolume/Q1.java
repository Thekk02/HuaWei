package AVolume;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author kk
 * @description linux发行版的数量
 * @date 2024-12-5 09:57:26
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        UnionFindSet ufs = new UnionFindSet(n);
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(helper(matrix,n));
    }
    public static int helper(int[][] matrix,int n ){
        UnionFindSet ufs = new UnionFindSet(n);
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(matrix[i][j] == 1){
                    ufs.Union(i,j);
                }
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            Integer fa = ufs.Find(ufs.fa[i]);
            map.put(fa,map.getOrDefault(fa,0) + 1);
        }
        return map.values().stream().max((a,b) -> a-b).get();
    }


    static class UnionFindSet{
        int[] fa;
        int count;
        public  UnionFindSet(int n){
            this.count = n;
            this.fa = new int[n];
            for(int i = 0;i < n;i++){
                fa[i] = i;
            }
        }
        public int Find(int x){
            int x_fa = fa[x];
            if(x_fa != x){
                return this.fa[x] = this.Find(this.fa[x]);
            }
            return x;
        }
        public void Union(int x,int y){
            int x_fa = Find(x);
            int y_fa = Find(y);
            if(x_fa != y_fa){
             fa[x] = y_fa;
             this.count--;
            }
        }
    }


}
