package EVolume;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author kk
 * @description 推荐多样性
 * @date 2024-12-27 10:45:00
 */
public class Q75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRows = sc.nextInt();
        int numberOfColumns = sc.nextInt();
        List<Queue<Integer>> queueList = new ArrayList<>();
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            Queue<Integer> numberQueue = Arrays.stream(str.split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedList::new));
            queueList.add(numberQueue);
        }
        int[] matrix = new int[numberOfColumns * numberOfRows];
        int matrixIndx = 0;
        int queueIndex = 0;

    }
}
