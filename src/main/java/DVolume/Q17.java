package DVolume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author kk
 * @description 最大时间
 * @date 2025-1-6 10:32:24
 */
public class Q17 {
    static Pattern c = Pattern.compile("(([01][0-9] || [2][1-3])):([0-5][0-9]):([0-5][0-9])");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Integer[] arr = Arrays.stream(s.substring(1,s.length() - 1).split(",")).map(Integer::parseInt).toArray(Integer[]::new);
        System.out.println(helper(arr));

    }

    public static String helper(Integer[] arr){
        ArrayList<String> res = new ArrayList<>();
        dfs(arr,new boolean[arr.length],new LinkedList<>(),res);
        if(res.size() == 0){
            return "invalid";
        }
        res.sort((a,b) -> b.compareTo(a));
        return res.get(res.size() - 1);
    }
    public static void dfs(Integer[] arr, boolean[] used, LinkedList<Integer> path,ArrayList<String> res){
        if(path.size() == arr.length){
            Integer[] t = path.toArray(new Integer[0]);
            String time = t[0] + "" + t[1] + ":" + t[2] + "" + t[3] + ":" + t[4] + "" + t[5];
            if(c.matcher(time).matches()){
                res.add(time);
                return;
            }
        }
        for(int i = 0;i < arr.length;i++){
            if(!used[i]){
                path.add(arr[i]);
                used[i] = true;
                dfs(arr,used,path,res);
                used[i] = false;
                path.removeLast();
            }
        }
    }
}
