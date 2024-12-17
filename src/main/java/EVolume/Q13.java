package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 高矮个子排队
 * @date 2024-12-5 15:01:26
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(!s.matches("[0-9\\s]")){
            System.out.println("[]");
            return;
        }

        int[] heights = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int i = 0,j = 1;
        while(j < heights.length){
            if(heights[i] != heights[j] && heights[i] > )
        }
    }
}
