package EVolume;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 跳房子
 * @date 2024-12-27 10:21:38
 */
public class Q73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int[] steps = Arrays.stream(str.substring(1,str.length() - 1).split(",")).mapToInt(Integer::parseInt).toArray();
        int sum = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < steps.length;i++){
            for(int j = 0;j < steps.length;j++){
                if(steps[i] + steps[j] == sum){
                    System.out.println("[" + steps[i] + "" + "," + steps[j] + "" + "]");
                    return;
                }
            }
        }
    }
}
