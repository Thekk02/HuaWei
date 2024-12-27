package EVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 特殊的加密算法
 * @date 2024-12-27 10:04:37
 */
public class Q72 {
    static int n,m;
    static int[][] book;
    static int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    static String minPath = "";
    static boolean found = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] data = new int[n];
        for(int i = 0;i < n;i++){
            data[i] = sc.nextInt();
        }
        m = sc.nextInt();
        book = new int[m][m];
        for(int i = 0;i < m;i++){
            for(int j =0;j < m;j++){
                book[i][j] = sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[m][m];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < m;j++){
                if(book[i][j] == data[0]){
                    dfs(data,0,i,j,visited,"");
                }
            }
        }
        System.out.println(found ? minPath.trim() : "error");
    }
    public static void dfs(int[] data,int index,int x,int y,boolean[][] visited,String path){
        if(index == n){
            if(!found || path.compareTo(minPath) < 0){
                minPath = path;
            }
            found = true;
            return;
        }
        if(x < 0 || y < 0 || x >= m || y >= m || visited[x][y] || book[x][y] != data[index]){
            return;
        }
        visited[x][y] = true;
        String newPath = path + x + " " + y + " ";
        if(index == n - 1 || book[x][y] == data[index]){
            dfs(data,index + 1,x,y,visited,newPath);
        }
        for(int[] dirction : directions){
            int newX = x + dirction[0];
            int newY = y + dirction[1];
            dfs(data,index + 1,newX,newY,visited,newPath);
        }
        visited[x][y] = false;
    }
}
