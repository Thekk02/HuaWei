package AVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 快递业务站
 * @date 2024-12-28 11:24:47
 */
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }



     static class UnionFindSet{
        int[] fa ;
        int count;
        public UnionFindSet(int n){
            this.fa = new int[n];
            this.count = count;
        }
        public int find(int x){
            if(fa[x] != x){
                return (this.fa[x] = this.find(fa[x]));
            }
            return x;
        }
        public void Union(int x, int y){

        }
    }
}
