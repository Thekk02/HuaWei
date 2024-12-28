package BVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 非严格递增连续数字序列
 * @date 2024-12-28 09:31:00
 */
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(helper(str));
    }

    public static int helper(String str){
        int l = 0,r = 0;
        int maxlen = 0;
        while(r < str.length()){
            char c = str.charAt(r);
            if(c >= '0' && c <= '9'){
                if(l != r){
                    if(c >= str.charAt(r - 1)){
                        maxlen = Math.max(maxlen,r - l + 1);
                    }else{
                        maxlen = Math.max(maxlen,r - l);
                        l = r;
                    }
                    r++;
                }else{
                    maxlen = Math.max(maxlen,1);
                    r++;
                }
            }else{
                maxlen = Math.max(maxlen,r - l);
                r++;
                l = r;
            }
        }
        return maxlen;
    }
}
