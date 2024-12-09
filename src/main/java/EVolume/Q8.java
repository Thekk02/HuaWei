package EVolume;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kk
 * @description 单词接龙
 * @date 2024-12-5 14:52:04
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();

        int num = sc.nextInt();

        List<String> list = new ArrayList<>();

        for(int i = 0;i < num;i++){
            list.add(sc.nextLine());
        }

        String res = list.get(start);


    }
}
