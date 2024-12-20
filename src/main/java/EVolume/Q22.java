package EVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 考勤信息
 * @date 2024-12-9 11:03:28
 */
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counts = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        while(counts > 0){
            String[] jilu = sc.nextLine().split(" ");
            System.out.println(canReceiveAward(jilu));
            counts--;
        }
    }

    private static boolean canReceiveAward(String[] records){
        int absentCount = 0;
        for(int i = 0;i < records.length;i++){
            if("absent".equals(records[i])){
                absentCount++;
                if(absentCount > 1){
                    return false;
                }
            }
            if("late".equals(records[i]) || "leaveearly".equals(records[i])){
                if(i > 0 && ("late".equals(records[i - 1]) || "leaveearly".equals(records[i - 1]))){
                    return false;
                }
            }
            if(i >= 6){
                int count = 0;
                for(int j = i - 6;j <= i;j++){
                    if(!"present".equals(records[j])){
                        count++;
                    }
                }
                if(count > 3){
                    return false;
                }
            }
        }
        return true;
    }
}
