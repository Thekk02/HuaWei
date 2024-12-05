package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description IPv4转数字
 * @date 2024-12-5 09:50:50
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split("#");
        if(strs.length != 4){
            System.out.println("invalid IP");
            return;
        }
        for(String str : strs){
            if(!isNumber(str)){
                System.out.println("invalid IP");
                return;
            }
            if(str.length() == 0){
                System.out.println("invalid IP");
                return;
            }
        }
        int one = Integer.parseInt(strs[0]);
        if(one < 1 || one > 128){
            System.out.println("invalid IP");
            return;
        }
        for(int i = 1;i <= 3;i++){
            int temp = Integer.parseInt(strs[i]);
            if(temp < 0 || temp > 255){
                System.out.println("invalid IP");
                return;
            }
        }
        long ans = 0;
        for(int i = 0;i < 4;i++){
            System.out.println(Integer.parseInt(strs[i]));
            ans += ans * 256 + Integer.parseInt(strs[i]);
        }
        System.out.println(ans);

    }
    //判断字符串是不是数字
    public static boolean isNumber(String str){
        for(int i = 0;i < str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
