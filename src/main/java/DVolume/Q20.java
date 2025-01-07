package DVolume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author kk
 * @description 最长的指定瑕疵度的元音子串
 * @date 2025-1-6 11:29:00
 */
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flaw = sc.nextInt();
        String s = sc.nextLine();
        //System.out.println(helper(flaw,s));
    }
//    public static int helper(int flaw,String s){
//        char[] yuan = {'a','e','i','o','u','A','E','I','O','U'};
//        HashSet<Character> set = new HashSet<>();
//        for(char c : yuan){
//            set.add(c);
//        }
//        ArrayList<Integer> idxs = new ArrayList<>();
//        for(int i = 0;i < s.length();i++){
//            if(set.contains(s.charAt(i))){
//                idxs.add(i);
//            }
//        }
//        int ans = 0;
//        int n = idxs.size();
//        int l = 0;
//        int r = 0;
//        while(r < n){
//            int diff = idxs.get(r) - idxs.get(l) - (r - l)
//        }
//    }
}
