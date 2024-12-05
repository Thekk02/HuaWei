package hw;

import java.util.*;

/**
 * @author kk
 * @description 告警抑制
 * @date 2024-12-3 09:22:45
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Map<String,String> map = new HashMap<>();
        for(int i = 0;i < num;i++){
            String key =sc.next();
            String value = sc.next();
            map.put(key,value);
        }
        String[] xinhao = sc.nextLine().split(" ");
        Set<String> set = new HashSet<>();
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0;i < xinhao.length;i++){
            if(set.contains(xinhao[i])){
                continue;
            }else{
                for(String str : ans){
                    if(map.get(str).equals(xinhao[i])){
                        set.add(xinhao[i]);
                        break;
                    }
                }
            }
        }
    }
}
