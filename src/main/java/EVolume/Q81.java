package EVolume;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author kk
 * @description 文本统计分析
 * @date 2024-12-27 11:20:13
 */
public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(sc.hasNextLine()){
            sb.append(sc.nextLine()).append("\n");
        }
        sc.close();
        //System.out.println(helper(sb.toString()));
    }

}
