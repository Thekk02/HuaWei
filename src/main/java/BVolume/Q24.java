package BVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 分糖果
 * @date 2024-12-28 09:53:42
 */
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(recursive(sc.nextInt(),0));
    }

    public static int recursive(long num,int count){
        if(num == 1){
            return count;
        }else if(num % 2 == 0){
            return recursive(num / 2,count + 1);
        }else{
            return Math.min(recursive(num + 1,count + 1),recursive(num - 1,count + 1));
        }
    }
}

