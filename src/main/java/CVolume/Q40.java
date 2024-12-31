package CVolume;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 是否存在满足条件的数字组合
 * @date 2024-12-28 14:21:18
 */
public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Integer[] arr = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        System.out.println(helper(n,arr));
    }
    public static String helper(int n ,Integer[] arr){
        Arrays.sort(arr,(a,b) -> b - a);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] == arr[j] + 2 * arr[k]) {
                        return arr[i] + " " + arr[j] + " " + arr[k];
                    }
                    if (arr[i] == arr[k] + 2 * arr[j]) {
                        return arr[i] + " " + arr[k] + " " + arr[j];
                    }
                }
            }
        }
        return "0";
    }
}
