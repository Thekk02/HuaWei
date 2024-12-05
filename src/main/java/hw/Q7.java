package hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 跳房子1
 * @date 2024-12-3 09:20:58
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arrs = sc.nextLine();
        int[] steps = Arrays.stream(arrs.substring(1,arrs.length() - 1).split(",")).mapToInt(Integer::parseInt).toArray();
        int num = sc.nextInt();
        for(int i = 0;i < steps.length;i++){
            for(int j = i + 1;j < steps.length;j++){
                if(steps[i] + steps[j] == num){
                    System.out.println("[" + steps[i] + "," + steps[j] + "]");
                    return;
                }
            }
        }
    }
}
