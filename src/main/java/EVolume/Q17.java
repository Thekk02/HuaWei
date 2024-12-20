package EVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 环中最长子串字符成环找偶数
 * @date 2024-12-5 15:25:04
 */
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'o'){
                count++;
            }
        }
        if(count % 2 == 0){
            System.out.println(str.length());
        }else{
            System.out.println(str.length() - 1);
        }
    }
}
