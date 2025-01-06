package DVolume;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author kk
 * @description 执行任务赚积分
 * @date 2024-12-28 16:19:50
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[][] wos = new int[n][2];
        for(int i = 0;i < n;i++){
            wos[i][0] = sc.nextInt();
            wos[i][1] = sc.nextInt();
        }
        System.out.println(helper(wos,t));
    }
    public static int helper(int[][] wos,int t){
        Arrays.sort(wos,(a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a -b);
        int curTime = 0;
        int ans = 0;
        for(int[] wo : wos){
            int endTime = wo[0];
            int score = wo[1];
            if(curTime < endTime){
                pq.offer(score);
                curTime++;
            }else{
                if(pq.size() == 0){
                    continue;
                }
                int min_score = pq.peek();
                if(score > min_score){
                    pq.poll();
                    pq.offer(score);
                    ans += score - min_score;
                }
            }
        }
        while(pq.size() > t && t > 0){
            ans -= pq.poll();
        }
        return ans;
    }
}
