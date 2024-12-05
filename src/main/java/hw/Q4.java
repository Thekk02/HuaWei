package hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 拔河比赛
 * @date 2024-12-3 09:03:52
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> peoples = new ArrayList<>();
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            int[] people = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            peoples.add(people);
        }
        peoples.sort((a,b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);
        for(int i = 0;i < 10;i++){
            System.out.println(peoples.get(i)[0] + " " + peoples.get(i)[1]);
        }

    }
}
