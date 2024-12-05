package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kk
 * @description 查字典
 * @date 2024-12-3 09:21:12
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String pre = sc.next();
        int num = sc.nextInt();
        List<String> ans = new ArrayList<>();
        for(int i =0;i < num;i++){
            String str = sc.next();
            if(str.startsWith(pre)){
                ans.add(str);
            }
        }
        if(ans.isEmpty()){
            System.out.println(-1);
        }else{
            for(String str : ans){
                System.out.println(str);
            }
        }
    }
}
