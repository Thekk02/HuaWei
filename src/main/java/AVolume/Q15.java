package AVolume;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author kk
 * @description 二元组个数
 * @date 2024-12-20 14:41:51
 */
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        List<Integer> listN = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int n = sc.nextInt();
        List<Integer> listM = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        System.out.println();
    }
    public static int helper(List<Integer> listM,List<Integer> listN){
        HashSet<Integer> setM = new HashSet<Integer>(listM);
        HashSet<Integer> setN = new HashSet<Integer>(listN);
        HashMap<Integer,Integer> countM = new HashMap<>();
        for(Integer m : listM){
            if(setN.contains(m)){
                countM.put(m,countM.getOrDefault(m,0) + 1);
            }
        }
        HashMap<Integer,Integer> countN = new HashMap<>();
        for(Integer n :listN){
            countN.put(n,countN.getOrDefault(n,0) + 1);
        }
        int count = 0;
        for(Integer k : countM.keySet()){
            count += countM.get(k) * countN.get(k);
        }
        return count;
    }
}
