package EVolume;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author kk
 * @description VLAN资源池
 * @date 2024-12-5 14:24:20
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Integer num = Integer.parseInt(sc.nextLine());

        List<Integer> vlans = getVlans(str);
        Collections.sort(vlans);

        vlans.remove(num);

        System.out.println(outVlans(vlans));

    }

    //解析vlan资源池
    public static List<Integer> getVlans(String str){
        List<Integer> ans = new ArrayList<>();
        String[] strs = str.split(",");
        for(String s : strs){
            if(s.contains("-")){
                String[] nums = s.split("-");
                Integer start = Integer.parseInt(nums[0]);
                Integer end = Integer.parseInt(nums[1]);
                for(int i = start;i <= end;i++){
                    ans.add(i);
                }
            }else{
                ans.add(Integer.parseInt(s));
            }
        }
        return ans;
    }

    //格式化vlan资源池
    private static  String outVlans(List<Integer> list){
        StringBuilder sb = new StringBuilder();
        Integer last = null;
        for(int i = 0;i < list.size();i++){
            if(last == null){
                sb.append(list.get(i));
                last = list.get(i);
            }else{
                if(list.get(i) - last == 1){
                    if(sb.toString().endsWith("-" + last)){
                        sb.replace(list.lastIndexOf(last.toString()),sb.length(),list.get(i).toString());

                    }else{
                        sb.append("-").append(list.get(i));
                    }
                }else{
                    sb.append(",").append(list.get(i));
                }
                last = list.get(i);
            }
        }
        return sb.toString();
    }
}
