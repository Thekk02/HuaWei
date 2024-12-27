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
        List<List<Integer>> task = new ArrayList<>();
        for(int i = 0;i < n;i++){
            int starttime = sc.nextInt();
            int endtime = starttime + sc.nextInt();
            List<Integer> list = new ArrayList<>();
            list.add(starttime);
            list.add(endtime);
            task.add(list);
        }
        //按照结束时间排序
        task.sort(Comparator.comparingInt(a -> a.get(1)));
        //获取第一个演出的结束时间和初始化观看的演出场数
        int firstEndTime = task.get(0).get(1);
        int numShows = 1;

        for(List<Integer> list : task){
            int starttime = list.get(0);
            int endTime = list.get(1);
            if(starttime - firstEndTime >= 15){
                numShows++;
                firstEndTime = endTime;
            }
        }
        System.out.println(numShows);
    }
}
