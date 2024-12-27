package EVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 数字游戏
 * @date 2024-12-27 09:56:47
 */
public class Q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] input = sc.nextLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int[] nums = new int[n];

            for(int i = 0;i < n;i++){
                nums[i] = sc.nextInt();
            }

            boolean[] remainderExists = new boolean[m];
            int sum = 0;
            boolean found = false;
            for(int num : nums){
                sum += num;
                int remiander = sum % m;
                if(remainderExists[remiander]){
                    found = true;
                    break;
                }else{
                    remainderExists[remiander] = true;
                }
            }
            System.out.println(found ? 1 : 0);
        }
    }
}
