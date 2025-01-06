package DVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 没有回文串
 * @date 2025-1-6 15:03:26
 */
public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        System.out.println(helper(n,s));
    }
    public static String helper(int n,String s){
        char[] chars = s.toCharArray();
        char limit = (char)('a' + n - 1);
        boolean back = false;
        int i = chars.length - 1;
        while(i >= 0){
            if(chars[i] < limit){
                if(!back){
                    chars[i] += 1;
                }else{
                    back = false;
                }
                if(i - 1 >= 0 && chars[i] == chars[i - 1]){
                    continue;
                }
                if(i - 2 >= 0 && chars[i] == chars[i - 2]){
                    continue;
                }
                if(i == chars.length - 1){
                    return new String(chars);
                }
                i++;
                back = true;
            }else{
                chars[i] = 'a';
                i--;
            }
        }
        return "NO";
    }
}
