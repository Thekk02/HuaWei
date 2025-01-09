package EVolume;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author kk
 * @description 观看文艺汇演问题
 * @date 2024-12-23 15:07:44
 */
public class Q67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> infos = new ArrayList<>();
        for(int i = 0;i < n;i++){
            int startTime = sc.nextInt();
            int endTime = sc.nextInt() + startTime;
            ArrayList<Integer> info = new ArrayList<>();
            info.add(startTime);
            info.add(endTime);
            infos.add(info);
        }
        infos.sort(Comparator.comparingInt(a -> a.get(1)));
        //第一个开始的时间
        int firstEndTime = infos.get(0).get(1);
        int ans = 1;
        for(List<Integer> info : infos){
            int satrtTime = info.get(0);
            int endTime = info.get(1);
            if(satrtTime - firstEndTime >= 15){
                ans++;
                firstEndTime = endTime;
            }
        }
        System.out.println(ans);
    }
}
