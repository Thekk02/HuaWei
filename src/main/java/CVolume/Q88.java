package CVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 寻找相同子串
 * @date 2024-12-28 15:27:22
 */
public class Q88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str2.length() > str1.length()){
            System.out.println("No");
            return;
        }
        int num = str1.indexOf(str2);
        if(num >= 0){
            System.out.println(num + 1);
            return;
        }
        else{
            System.out.println("No");
            return;
        }
    }
}
