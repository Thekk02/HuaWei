package AVolume;

import java.util.*;

/**
 * @author kk
 * @description 端口合并
 * @date 2024-12-20 14:38:47
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m > 10 || m < 0) {
            System.out.println("[[]]");
            return;
        }
        ArrayList<ArrayList<Integer>> ports = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Integer[] tmp = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
            int n = tmp.length;
            if (n < 1 || n > 100) {
                System.out.println("[[]]");
                return;
            }
            ArrayList<Integer> tmpList = new ArrayList<>(Arrays.asList(tmp));
            ports.add(tmpList);
        }
        System.out.println();
    }

    public static String helper(ArrayList<ArrayList<Integer>> ports){
        while(true){
            for(int i = ports.size() - 1;i >= 0;i--){
                for(int j = i -1;j >= 0;j--){
                    if(canUnion(ports.get(i),ports.get(j))){
                        ports.get(j).addAll(ports.get(i));
                        ports.remove(i);
                        continue;
                    }
                }
            }
            break;
        }
        StringJoiner out = new StringJoiner(",", "[", "]");
        for (ArrayList<Integer> port : ports) {
            StringJoiner in = new StringJoiner(",", "[", "]");
            for (Integer v : new TreeSet<Integer>(port)) { // 这里使用TreeSet是为了实现：组内相同端口仅保留一个，从小到达排序。
                in.add(v + "");
            }
            out.add(in.toString());
        }

        return out.toString();
    }

    public static boolean canUnion(ArrayList<Integer> port1,ArrayList<Integer> port2){
        port1.sort((a,b) -> a-b);
        port2.sort((a,b) -> a-b);
        int same = 0;
        int i = 0,j = 0;
        while(i < port1.size() && j < port2.size()){
            if(port1.get(i) - port2.get(j) == 0){
                i++;
                j++;
                if(++same >= 2){
                    return true;
                }
            }else if(port1.get(i) > port2.get(j)){
                j++;
            }else{
                i++;
            }
        }
        return false;
    }
}
