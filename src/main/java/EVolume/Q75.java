package EVolume;

import java.nio.file.FileSystems;
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
        int n = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());
        List<Queue<Integer>> queueList = new LinkedList<>();
        while(sc.hasNextLine()){
            String inputLine = sc.nextLine();
            Queue<Integer> numberQueue = Arrays.stream(inputLine.split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedList::new));
            queueList.add(numberQueue);
        }
        int[] matrix = new int[n * k];
        int matrixIndex = 0;
        int queueIndex = 0;
        while(matrixIndex < matrix.length){
            boolean didRemoveQueue = false;
            for(int i = 0;i < n && !queueList.isEmpty();i++){
                if(queueList.get(queueIndex).isEmpty()){
                    queueList.remove(queueIndex);
                    if(queueList.isEmpty()){
                        break;
                    }
                    queueIndex %= queueList.size();
                    didRemoveQueue = true;
                }
                if(!queueList.get(queueIndex).isEmpty()){
                    matrix[matrixIndex++] = queueList.get(queueIndex).poll();
                    if(matrixIndex >= matrix.length){
                        break;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int row = 0;row < n;row++){
                for(int col = 0;col < n;col++){
                    sb.append(matrix[col * n + row]).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }


    }
}
