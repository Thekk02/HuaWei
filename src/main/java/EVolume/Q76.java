package EVolume;

import java.util.*;

/**
 * @author kk
 * @description 寻找符合要求的最长子串
 * @date 2024-12-27 10:55:11
 */
public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        String str = sc.nextLine();
        Map<Character,List<Integer>> charIndexMap = new HashMap<>();
        int left = 0,right = 0;
        int maxLength = 0;
        while(right < str.length()){
            char cur = str.charAt(right);
            if(c == cur){
                maxLength = Math.max(maxLength,right - left);
                right++;
                left = right;
            }else{
                charIndexMap.computeIfAbsent(cur,k -> new ArrayList<>());
                List<Integer> charIndexs = charIndexMap.get(cur);
                if(charIndexs.size() == 2){
                    maxLength = Math.max(maxLength,right - left);
                    left = charIndexs.get(0) + 1;
                    charIndexs.remove(0);
                }
                charIndexs.add(right);
                right++;
            }
        }
        maxLength = Math.max(maxLength,right - left);
        System.out.println(maxLength);
    }
}
