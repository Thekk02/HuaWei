package EVolume;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author kk
 * @description 空栈压数
 * @date 2024-12-27 13:22:45
 */
public class Q87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        LinkedList<Integer> stack = new LinkedList<>();
        for(String str : strs){
            int curNumber = Integer.parseInt(str);
            int partialSum = curNumber;
            for(int index = stack.size() - 1;index >= 0;index--){
                partialSum -= stack.get(index);
                if(partialSum == 0){
                    stack.subList(index,stack.size()).clear();
                    curNumber *= 2;
                    partialSum = curNumber;
                }else if(partialSum < 0){
                    break;
                }

            }
            stack.add(curNumber);
        }
        StringJoiner sj = new StringJoiner(" ");
        while(!stack.isEmpty()){
            sj.add(stack.removeLast().toString());
        }
        System.out.println(sj.toString());
    }
}
