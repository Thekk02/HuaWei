package BVolume;

import java.util.*;

/**
 * @author kk
 * @description 树状结构查询
 * @date 2025-1-4 10:54:35
 */
public class Q110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, HashSet<String>> tree = new HashMap<>();
        for(int i = 0;i < n;i++){
            String ch = sc.next();
            String fa = sc.next();
            tree.putIfAbsent(fa,new HashSet<>());
            tree.get(fa).add(ch);
        }
        String target = sc.next();
        helper(tree,target);
    }
    public static void helper(HashMap<String,HashSet<String>> tree,String target){
        if(!tree.containsKey(target)){
            System.out.println("");
            return;
        }
        LinkedList<String> queue = new LinkedList<>(tree.get(target));
        ArrayList<String> ans = new ArrayList<>();
        while(!queue.isEmpty()){
            String node = queue.removeFirst();
            ans.add(node);
            if(tree.containsKey(node)){
                queue.addAll(tree.get(node));
            }
            ans.sort(String::compareTo);
            ans.forEach(System.out::println);
        }
    }
}
