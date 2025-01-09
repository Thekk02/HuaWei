package EVolume;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author kk
 * @description 字符串拼接
 * @date 2024-12-27 11:18:44
 */
public class Q79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        String str = parts[0];
        int length = Integer.parseInt(parts[1]);
        int count = countDistincStrings(str,length);
        System.out.println(count);
    }
    public static int countDistincStrings(String str,int length){
        HashSet<String> set = new HashSet<>();
        boolean[] used = new boolean[str.length()];
        generateDistinctStrings(str,length,"",set,used);
        return set.size();
    }
    public static void generateDistinctStrings(String str,int length,String current,HashSet<String> set,boolean[] used){
        if(current.length() == length){
            set.add(current);
            return;
        }
        for(int i = 0;i < str.length();i++){
            if(used[i] || (current.length() > 0 && current.charAt(current.length() - 1) == str.charAt(i))){
                continue;
            }
            used[i] = true;
            generateDistinctStrings(str,length,current + str.charAt(i),set,used);
            used[i] = false;
        }
    }
}
