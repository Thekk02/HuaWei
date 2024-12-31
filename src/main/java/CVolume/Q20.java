package CVolume;

import java.util.*;

/**
 * @author kk
 * @description 堆栈中的剩余数字
 * @date 2024-12-28 11:02:28
 */
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(helper(nums));
    }
    public static String helper(int[] nums){
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(nums[0]);
        for(int i = 1;i < nums.length;i++){
            push(nums[i],stack);
        }
        StringJoiner sj = new StringJoiner(" ");
        while(!stack.isEmpty()){
            sj.add(stack.removeLast().toString());
        }
        return sj.toString();
    }

    public static void push(int num,LinkedList<Integer> stack){
        int sum = num;
        for(int i = stack.size() - 1;i>=0;i--){
            sum -= stack.get(i);
            if(sum == 0){
                stack.subList(i,stack.size()).clear();
                push(num * 2,stack);
                return;
            }else if(sum < 0){
                break;
            }
        }
        stack.add(num);
    }


}
