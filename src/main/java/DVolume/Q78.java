package DVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 字符串拼接
 * @date 2025-1-6 16:45:03
 */
public class Q78 {
    static String s;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        n = sc.nextInt();
        System.out.println(helper(s,n));
    }
    public static int helper(String s,int n){
        if(s.length() < n || s.length() <=0 || s.length() > 30){
            return 0;
        }
        char[] cArr = s.toCharArray();
        for(char c : cArr){
            if(c < 'a' || c > 'z'){
                return 0;
            }
        }
        Arrays.sort(cArr);
        return dfs(cArr,-1,0,new boolean[cArr.length],0);
    }
    public static int dfs(char[] cArr,int pre,int level,boolean[] used,int count){
        if(level == n){
            return ++count;
        }
        for(int i = 0;i < cArr.length;i++){
            if(used[i]){
                continue;
            }
            if(pre > 0 && cArr[i] == cArr[pre]){
                continue;
            }
            if(i > 0 && cArr[i] == cArr[i - 1] && !used[i - 1]){
                continue;
            }
            used[i] = true;
            count = dfs(cArr,i,level+1,used,count);
            used[i] = false;
        }
        return count;
    }

}
