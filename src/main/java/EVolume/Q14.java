package EVolume;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @author kk
 * @description 构成正方形的数量
 * @date 2024-12-5 15:12:19
 */
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        int min = sc.nextInt();
        int[][] matrix = new int[r][c];

        int ans = 0;

        for(int i = s;i <= r;i++){
            for(int j = s;j <= c;j++){
                int square = 0;
                for(int x = i-s;x < i;x++){
                    for(int y = j - s;y < j;y++){
                        square += matrix[x][y];
                    }
                }
                if(square >= min){
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }
}
