package EVolume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 最大社交距离
 * @date 2024-12-27 14:19:09
 */
public class Q94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seatNum = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] parts = str.substring(1,str.length() - 1).split(",");
        ArrayList<Integer> seatOrLeave = new ArrayList<>();
        for(String part : parts){
            seatOrLeave.add(Integer.parseInt(part));
        }
        ArrayList<Integer> seat = new ArrayList<>();
        int ans = -1;
        for(int sol : seatOrLeave){
            if(sol != 1){
                seat.remove(Integer.valueOf(sol));
            }else{
                if(seat.isEmpty()){
                    ans = 0;

                }else{
                    int maxDistance = seat.get(0);
                    ans = 0;
                    for(int i = 0;i < seat.size();i++){
                        int distance = 0;
                        if(i == seat.size() - 1){
                            distance = seatNum - 1 - seat.get(i) / 2;
                        }else{
                            distance = (seat.size() - 1)
                        }
                    }
                }
            }
        }
    }
}
