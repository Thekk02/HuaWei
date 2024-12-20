package AVolume;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kk
 * @description 处理器问题
 * @date 2024-12-20 14:15:21
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        String[] strs = str.substring(1,str.length() - 1).split(",");
        List<Integer> line1 = new ArrayList<>();
        List<Integer> line2 = new ArrayList<>();
        for(int i =0;i < strs.length;i++){
            int n = Integer.parseInt(strs[i]);
            if(n < 4){
                line1.add(n);
            }else{
                line2.add(n);
            }
        }
        if(num == 8){

        }else if(num == 4){

        }else if(num == 2){

        }else{

        }
    }
}
