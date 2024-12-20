package EVolume;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author kk
 * @description 喊7的次数重排
 * @date 2024-12-5 15:21:34
 */
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counts = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int total = Arrays.stream(counts).sum();
        int len = counts.length;
        int[] peopleCounts = new int[len];
        int currentNumber = 1;
        int currentIndex = 0;
        while(total > 0){
            if(currentNumber % 7 == 0 || (currentNumber + " ").contains("7")){
                total--;
                peopleCounts[currentIndex]++;
            }
            currentNumber++;
            currentIndex = (currentIndex + 1) % len;
        }
        StringJoiner sj = new StringJoiner(" ");
        for(int num : peopleCounts){
            sj.add(String.valueOf(num));
        }
        System.out.println(sj.toString());
    }
}
