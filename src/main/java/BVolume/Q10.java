package BVolume;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kk
 * @description 拔河比赛
 * @date 2024-12-27 16:14:22
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<int[]> list = new ArrayList<>();
        while(sc.hasNextLine()){
            int[] person = new int[2];
            person[0] = sc.nextInt();
            person[1] = sc.nextInt();
            list.add(person);
        }
        list.sort((a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i)[0] + " " + list.get(i)[1]);
        }
    }
}
