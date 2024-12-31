package AVolume;

import com.sun.org.apache.bcel.internal.generic.LNEG;
import javafx.scene.transform.Scale;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kk
 * @description 投篮大赛
 * @date 2024-12-28 11:36:54
 */
public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");

        LinkedList<Integer> ans = new LinkedList<>();
        String reg = "^\\-?\\d+$";
        for(String str : strs){
            if(str.matches(reg)){
                ans.addLast(Integer.parseInt(str));
            }else{
                switch (str){
                    case "+":
                        if(ans.size() < 2){
                            System.out.println(-1);
                            return;
                        }
                    case "D" :
                        if(ans.size() < 1){
                            System.out.println(-1);
                            return;
                        }else{
                            ans.addLast(Integer.parseInt(str) * 2);
                        }
                    case "C":
                        if(ans.size() < 1){
                            System.out.println(-1);
                            return;
                        }else{
                            ans.removeLast();
                        }
                }
            }
        }

        int sum = 0;
        for(Integer num : ans){
            sum += num;
        }
        System.out.println(ans);

    }
}
