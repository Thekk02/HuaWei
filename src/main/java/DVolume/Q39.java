package DVolume;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kk
 * @description 考古学家
 * @date 2025-1-6 14:10:17
 */
public class Q39 {
    static int n;
    static String[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        arr = sc.nextLine().split(" ");
        helper();
    }
    public static void helper(){
        Arrays.sort(arr);
        boolean[] used = new boolean[n];
        LinkedList<String> path = new LinkedList<>();
        HashSet<String> res = new HashSet<>();
        dfs(used,path,res);
        res.stream().sorted(String::compareTo).forEach(System.out::println);
    }
    public static void dfs(boolean[] used,LinkedList<String> path,HashSet<String> res){
        if(path.size() == n){
            StringBuilder sb = new StringBuilder();
            path.forEach(sb::append);
            res.add(sb.toString());
            return;
        }
        for(int i = 0;i < n;i++){
            if(used[i]){
                continue;
            }
            if(i > 0 && arr[i].equals(arr[i - 1]) && !used[i - 1]){
                continue;
            }
            path.addLast(arr[i]);
            used[i] = true;
            dfs(used,path,res);
            used[i] = false;
            path.removeLast();
        }
    }
}
