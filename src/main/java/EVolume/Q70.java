package EVolume;

import java.util.*;

/**
 * @author kk
 * @description 树状结构查询
 * @date 2024-12-27 09:47:53
 */
public class Q70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Queue<String>> tree = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            String ch = sc.next();
            String fa = sc.next();
            tree.putIfAbsent(fa,new LinkedList<>());
            tree.get(fa).offer(ch);
        }
        String target = sc.next();
        List<String> ans = new LinkedList<>();
        Queue<String> chs = tree.get(target);
        while(!chs.isEmpty()){
            String ch = chs.poll();
            ans.add(ch);
            if(tree.containsKey(ch)){
                chs.addAll(tree.get(ch));
            }
        }
        ans.forEach(ele -> System.out.println(ele));
    }
}
