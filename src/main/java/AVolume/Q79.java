package AVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 计算快递主站点
 * @date 2024-12-31 19:16:24
 */
public class Q79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                nums[i][j] = sc.nextInt();
            }
        }
        UnionFindSet ufs = new UnionFindSet(n);
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n;j++){
                if(nums[i][j] == 1){
                    ufs.union(i,j);
                }
            }
        }
        System.out.println(ufs.count);
    }
    static class UnionFindSet{
        int[] fa;
        int count;

        public UnionFindSet(int n){
            this.fa = new int[n];
            this.count = n;
            for(int i = 0;i < n;i++){
                fa[i] = i;
            }
        }
        public int find(int n){
            if(n != fa[n]){
                return (fa[n] = this.find(fa[n]));
            }
            return n;
        }
        public void union(int a,int b){
            int a_fa = this.find(a);
            int b_fa = this.find(b);
            if(a_fa != b_fa){
                fa[b] = a_fa;
                this.count--;
            }
        }

    }
}
