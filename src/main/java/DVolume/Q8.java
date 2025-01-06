package DVolume;

import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author kk
 * @description 转盘寿司
 * @date 2025-1-6 09:22:46
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prices = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = prices.length;

        int[] res = Arrays.copyOf(prices,n);
        LinkedList<Integer> stack = new LinkedList<>();
        for(int j = 0;j < n * 2;j++){
            int prices_j = prices[j % n];
            while(stack.size() > 0){
                int i = stack.getLast();
                if(prices[i] > prices_j){
                    stack.removeLast();
                    res[i] += prices_j;
                }else{
                    break;
                }
            }
            if(j < n){
                stack.add(j);
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for(int num : res){
            sj.add(num + "");
        }
        System.out.println(sj.toString());
    }
}
