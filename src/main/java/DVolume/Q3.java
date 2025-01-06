package DVolume;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.*;

/**
 * @author kk
 * @description 石头剪刀布u欧系
 * @date 2024-12-20 15:05:00
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, LinkedList<String >> map = new HashMap<>();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.length() == 0){
                break;
            }
            String[] player = line.split(" ");
            map.putIfAbsent(player[1],new LinkedList<>());
            map.get(player[1]).add(player[0]);
        }
        if(map.size() == 3 || map.size() == 1){
            System.out.println("NULL");
            return;
        }else{
            if(!map.keySet().contains("A")){
                LinkedList<String> ans = map.get("B");
                ans.sort((a,b) -> a.compareTo(b));
                ans.forEach(System.out::println);
            }
            if(!map.keySet().contains("B")){
                LinkedList<String> ans = map.get("C");
                ans.sort((a,b) -> a.compareTo(b));
                ans.forEach(System.out::println);
            }
            if(!map.keySet().contains("C")){
                LinkedList<String> ans = map.get("A");
                ans.sort((a,b) -> a.compareTo(b));
                ans.forEach(System.out::println);
            }
        }
    }
}
