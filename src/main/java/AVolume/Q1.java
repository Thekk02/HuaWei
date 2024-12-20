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
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(getResult(matrix,n));

    }
    public static int getResult(int[][] matrix, int n){
        UnionFindSet ufs = new UnionFindSet(n);
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n;j++){
                if(matrix[i][j] == 1){
                    ufs.union(i,j);
                }
            }
        }
        HashMap<Integer,Integer> connected = new HashMap<>();
        for(int i = 0;i < n;i++){
            Integer fa = ufs.find(ufs.fa[i]);
            connected.put(fa,connected.getOrDefault(fa,0) + 1);
        }
        return connected.values().stream().max((a,b) -> a - b).get();
    }



    //并查集实现
    static class UnionFindSet{
        int[] fa;
        int count;

        public UnionFindSet(int n){
            this.count = n;
            this.fa = new int[n];
            for(int i = 0;i < n;i++){
                this.fa[i] = 1;
            }
        }
        public int find(int x){
            if(x != this.fa[x]){
                return this.fa[x] = this.fa[this.fa[x]];
            }
            return x;
        }
        public void union(int x,int y){
            int x_fa = this.find(x);
            int y_fa = this.find(y);
            if(x_fa != y_fa){
                this.fa[y_fa] = x_fa;
                this.count--;
            }
        }

    }

}
