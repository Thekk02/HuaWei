package EVolume;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author kk
 * @description 查找接口成功率最优时间
 * @date 2024-12-5 14:47:58
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int min = Integer.parseInt(sc.nextLine());
        String strs = sc.nextLine();
        int[] fail = Arrays.stream(strs.split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = fail.length;
        int[] presum = new int[length];
        presum[0] = fail[0];
        for(int i  = 1;i < length;i++){
            presum[i] = presum[ i - 1] + fail[i];
        }
        ArrayList<int[]> ans = new ArrayList<>();
        int maxLength = 0;
        for(int i = 0;i < length;i++){
            for(int j = i;j < length;j++){
                int sum = i == 0 ? presum[0] : presum[j] - presum[i - 1];
                int len = j - i + 1;
                int totalfail = len * min;
                if(sum < totalfail){
                    if(len > maxLength){
                        ans = new ArrayList<>();
                        ans.add(new int[]{i,j});
                        maxLength = len;
                    }else if(len == maxLength){
                        ans.add(new int[]{i,j});
                }
                }
            }
        }
        if(ans.size() == 0){
            System.out.println("NULL");
        }else {
            ans.sort((a,b) -> a[0] - b[0]);
            StringBuilder sb = new StringBuilder();
            for(int[] res : ans){
                sb.append(res[0] + "-" + res[1] + " ");
            }
            System.out.println(sb.toString());
        }
    }
}
