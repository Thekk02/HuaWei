package CVolume;


import java.util.*;

/**
 * @author kk
 * @description 单词接龙
 * @date 2024-12-28 10:59:20
 */
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        String[] words = new String[n];
        for(int i = 0;i < n;i++){
            words[i] = sc.nextLine();
        }
        System.out.println(helper(k,n,words));
    }
    public static String helper(int k,int n,String[] words){
        ArrayList<String> chain = new ArrayList<>();
        chain.add(words[k]);
        words[k] = null;
        HashMap<Character, LinkedList<String> > prefix = new HashMap<>();
        for(String word : words){
            if(word != null){
                char c = word.charAt(0);
                prefix.putIfAbsent(c,new LinkedList<>());
                prefix.get(c).add(word);
            }
        }
        for(Character c : prefix.keySet()){
            prefix.get(c).sort((a,b) -> a.length() != b.length() ? b.length() - a.length() : a.compareTo(b));
        }
        while(true){
            String tail = chain.get(chain.size() - 1);
            char c = tail.charAt(tail.length() - 1);
            if(prefix.containsKey(c) && prefix.get(c).size() > 0){
                chain.add(prefix.get(c).removeFirst());
            }else{
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s : chain){
            sb.append(s);
        }
        return sb.toString();
    }
}
