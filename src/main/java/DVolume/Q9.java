package DVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 字符串变换最小字符串
 * @date 2025-1-6 09:32:00
 */
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(helper(sc.nextLine()));
    }
    public static String helper(String s){
        char[] minArr = s.toCharArray();
        Arrays.sort(minArr);
        String minS = minArr.toString();
        if(minS.equals(s)){
            return minS;
        }
        char[] sArr = s.toCharArray();
        for(int i = 0;i < s.length();i++){
            if(sArr[i] != minArr[i]){
                char tmp = sArr[i];
                sArr[i] = minArr[i];
                int swapIndex = s.lastIndexOf(minArr[i]);
                sArr[swapIndex] = tmp;
                break;
            }
        }
        return new String(sArr);
    }
}
