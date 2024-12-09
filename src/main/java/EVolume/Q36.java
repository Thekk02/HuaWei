package EVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 字符统计及重排
 * @date 2024-12-9 12:56:04
 */
public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[256];
        for(char ch : str.toCharArray()){
            count[ch]++;
        }
        int max_count = Arrays.stream(count).max().getAsInt();
        StringBuilder sb = new StringBuilder();
        for(int i = max_count;i > 0;i--){
            for(int j = 'a';j <= 'z';j++){
                if(count[j] == i){
                    sb.append((char)j);
                    sb.append(":");
                    sb.append(i);
                    sb.append(";");
                }
            }
            for(int j = 'A';j < 'Z';j++){
                if(count[j] == i){
                    sb.append((char)j);
                    sb.append(":");
                    sb.append(i);
                    sb.append(";");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
