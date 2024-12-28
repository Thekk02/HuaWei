package CVolume;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kk
 * @description 寻找身高相近的小朋友
 * @date 2024-12-28 15:26:16
 */
public class Q87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(),num = sc.nextInt();
        List<Integer> list = new ArrayList<>(num);
        for(int i = 0;i < num;i++){
            list.add(sc.nextInt());
        }
        list.sort((a,b) -> Math.abs(a - len) == Math.abs(b - len) ? a - b : Math.abs(a- len) - Math.abs(b -len));
        for(int i = 0;i < list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
