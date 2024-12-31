package CVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description We Are A Team
 * @date 2024-12-28 10:49:05
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        UnionFindSet ufs = new UnionFindSet(n + 1);
        for(int i = 0;i < m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(c == 0){
                ufs.union(a,b);
            }if(c == 1){
                if(ufs.find(a) == ufs.find(b)){
                    System.out.println("we are a team");
                }else{
                    System.out.println("we are not a team");
                }
            }
        }

    }
    static class UnionFindSet{
        int[] fa;
        int count;
        public UnionFindSet(int n){
            this.fa = new int[n];
            this.count = count;
        }
        public int find(int x){
            if(fa[x] != x){
                return (this.fa[x] = this.find(this.fa[x]));
            }
            return x;
        }
        public void union(int x,int y){
            int x_fa = this.find(x);
            int y_fa = this.find(y);
            if(x_fa != y_fa){
                this.fa[y] = x_fa;
            }
        }
    }
}
