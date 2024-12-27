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
        int n = sc.nextInt();
        HashMap<String, HashSet<String>> tree = new HashMap<>();
        for(int i = 0;i < n;i++){
            String childNode = sc.next();
            String parentNode = sc.next();
            tree.computeIfAbsent(parentNode,k -> new HashSet<>()).add(childNode);
        }
        String targetNode = sc.nextLine();
        if(!tree.containsKey(targetNode)){
            System.out.println(" ");
            return;
        }
        LinkedList<String> queue = new LinkedList<>(tree.get(targetNode));
        ArrayList<String> result = new ArrayList<>();
        while(!queue.isEmpty()){
            String node = queue.removeFirst();
            result.add(node);
            if(tree.containsKey(node)){
                queue.addAll(tree.get(node));
            }
        }
        result.sort(String::compareTo);
        result.forEach(System.out::println);
    }
}
