package EVolume;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kk
 * @description 跳格子3
 * @date 2024-12-27 10:32:30
 */
public class Q74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] scores = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(sc.nextLine());

        if(n == 1){
            System.out.println(scores[0]);
            return;
        }
        int[] dp = new int[n];
        dp[0] = scores[0];
        Deque<Integer> deque = new LinkedList<>();
        deque.add(0);
        for(int i = 1;i < n;i++){
            if(!deque.isEmpty() && deque.peekFirst() < i- k){
                deque.pollFirst();
            }
            dp[i] = scores[i] + (deque.isEmpty() ? 0 : dp[deque.peekFirst()]);
            while(!deque.isEmpty() && dp[deque.peekLast()] <= dp[i]){
                deque.pollLast();
            }
            deque.addLast(i);
        }
        System.out.println(dp[n - 1]);


    }
}
