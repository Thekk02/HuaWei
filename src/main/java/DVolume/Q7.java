package DVolume;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author kk
 * @description 只能成绩表
 * @date 2025-1-6 09:13:57
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] kemu = sc.nextLine().split(" ");
        HashMap<String,int[]> students = new HashMap<>();
        for(int i = 0;i < n;i++){
            String name = sc.next();
            int[] scores = new int[kemu.length];
            for(int j = 0;j < scores.length;j++){
                scores[i] = sc.nextInt();
            }
            students.put(name,scores);
        }
        String pai = sc.nextLine();
        int index = -1;
        for(int i = 0;i < kemu.length;i++){
            if(kemu[i].equals(pai)){
                index = i;
            }
        }
        if(index < 0){

        }
    }
}
