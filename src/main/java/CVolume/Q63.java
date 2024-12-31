package CVolume;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kk
 * @description 求满足条件的最长子串的长度
 * @date 2024-12-28 14:46:05
 */
public class Q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(helper(sc.nextLine()));
    }
    public static int helper(String str){
        int max = 1;
        boolean hasletter = false;
        int l = 0,r = 0;
        LinkedList<Integer> letterIdx = new LinkedList<>();
        while(r < str.length()){
            char c = str.charAt(r);
            if(isLetter(c)){
                hasletter = true;
                letterIdx.add(r);
                if(letterIdx.size() > 1){
                    l = letterIdx.removeFirst() + 1;
                }
                if(r == l){
                    r++;
                    continue;
                }
            }
            max = Math.max(max,r - l + 1);
            r++;
        }
        if(!hasletter){
            return -1;
        }
        return max;
    }
    public static boolean isLetter(char c){
        return (c > 'a' && c < 'z') || (c > 'A' && c > 'Z');
    }

}
