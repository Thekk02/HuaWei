package EVolume;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kk
 * @description 找单词
 * @date 2024-12-27 14:18:26
 */
public class Q91 {
//    private static int n;
//    private static String[][] matrix;
//    private static String tar;
//    private static boolean[][] visited;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        matrix = new String[n][n];
//        for(int i = 0;i < n;i++){
//            String[] line = sc.nextLine().split(",");
//            matrix[i] = line;
//        }
//        tar = sc.nextLine();
//        visited = new boolean[n][n];
//        String ans = findString();
//        System.out.println(ans);
//    }
//    private static String findString(){
//        LinkedList<Integer[]> path = new LinkedList<>();
//        for(int i = 0;i < n;i++){
//            for(int j = 0;j < n;j++){
//                if(matrix[i][j].equals(tar.substring(0,1))){
//                    boolean found = dfs(i,j,0,path);
//                    if(found){
//                        StringBuilder sb = new StringBuilder();
//                        for(Integer[] pos : path){
//                            sb.append(pos[0]).append(",").append(pos[1]).append(",");
//                        }
//                        sb.deleteCharAt(sb.length() - 1);
//                        return sb.toString();
//                    }
//                }
//            }
//        }
//        return "N";
//    }
//    private static boolean dfs(int i,int j,int k,LinkedList<Integer[]> path){
//        if(i < 0 || i >= n || j < 0 || j >= n || visited[i][j] || !tar.substring(k,k + 1).equals(matrix[i][j])){
//            return false;
//        }
//        path.add(new Integer[]{i,j});
//        visited[i][j] = true;
//        if(k == tar.length() - 1){
//            return true;
//        }
//        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
//        for(int[] dir : directions){
//            int ni = i + dir[0];
//            int nj = j + dir[1];
//            boolean res = dfs(ni,nj,k + 1,path);
//            if(res){
//                return true;
//            }
//        }
//        visited[i][j] = false;
//        path.removeLast();
//        return false;
//    }
private static int n;  // 二维数组的大小
    private static String[][] matrix;  // 二维数组
    private static String tar;  // 待查找的字符串
    private static boolean[][] visited;  // 记录每个单元格是否已被访问

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();  // 读取二维数组的大小
        scanner.nextLine();  // 读取并忽略换行符
        matrix = new String[n][n];  // 初始化二维数组
        // 读取二维数组的每一行
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.split(",");  // 使用逗号分割每一行，得到每个单元格的字符
        }
        tar = scanner.nextLine();  // 读取待查找的字符串
        scanner.close();  // 关闭扫描器

        visited = new boolean[n][n];  // 初始化访问记录数组
        String result = findString();  // 查找字符串
        System.out.println(result);  // 输出结果
    }

    // 查找字符串的函数
    public static String findString() {
        LinkedList<Integer[]> path = new LinkedList<>();  // 存储路径的链表
        // 遍历二维数组的每个单元格
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 如果当前单元格的字符与待查找字符串的第一个字符相同
                if (matrix[i][j].equals(tar.substring(0, 1))) {
                    // 使用深度优先搜索查找字符串
                    boolean found = dfs(i, j, 0, path);
                    // 如果找到了字符串
                    if (found) {
                        StringBuilder sb = new StringBuilder();
                        // 将路径中的每个单元格的位置添加到结果字符串中
                        for (Integer[] pos : path) {
                            sb.append(pos[0]).append(",").append(pos[1]).append(",");
                        }
                        sb.deleteCharAt(sb.length() - 1);  // 删除最后一个逗号
                        return sb.toString();  // 返回结果字符串
                    }
                }
            }
        }
        return "N";  // 如果没有找到字符串，返回"N"
    }

    // 深度优先搜索的函数
    public static boolean dfs(int i, int j, int k, LinkedList<Integer[]> path) {
        // 如果当前位置越界，或已被访问，或当前位置的字符与待查找字符串的当前字符不相同
        if (i < 0 || i >= n || j < 0 || j >= n || visited[i][j] || !tar.substring(k, k + 1).equals(matrix[i][j])) {
            return false;  // 返回false
        }
        path.add(new Integer[] {i, j});  // 将当前位置添加到路径中
        visited[i][j] = true;  // 标记当前位置已被访问
        // 如果已经找到了所有的字符
        if (k == tar.length() - 1) {
            return true;  // 返回true
        }
        // 定义四个方向
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        // 对四个方向进行深度优先搜索
        for (int[] direction : directions) {
            int ni = i + direction[0];
            int nj = j + direction[1];
            boolean res = dfs(ni, nj, k + 1, path);
            // 如果在某个方向上找到了字符串
            if (res) {
                return true;  // 返回true
            }
        }
        visited[i][j] = false;  // 撤销对当前位置的访问标记
        path.removeLast();  // 从路径中移除当前位置
        return false;  // 返回false
    }
}
