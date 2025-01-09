package EVolume;

import java.util.*;

/**
 * @author kk
 * @description 数字游戏
 * @date 2024-12-27 09:56:47
 */
public class Q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int[] line1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = line1[0];
            int m = line1[1];
            int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Queue<Integer> stack = new LinkedList<>();
            HashSet<Integer> set = new HashSet<>();
            stack.offer(nums[0]);
            set.add((nums[0] % m));
            for(int i = 1;i < n;i++){
                int num = stack.peek() + nums[i];
                if(set.contains(m % num)){
                    System.out.println(1);
                    break;
                }else{
                    stack.offer(num);
                    set.add(num % m);
                }
            }
            if(set.size() == n){
                System.out.println(-1);
            }
        }
    }
}
