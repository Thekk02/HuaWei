package EVolume;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author kk
 * @description We Are A Team
 * @date 2024-12-5 14:26:31
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  =sc.nextInt();
        int[][] mess = new int[m][3];
        if(n < 1 || n > 100000 || m < 1 || m > 100000){
            System.out.println("Null");
            return;
        }
        for(int i = 0;i < m;i++){
            for(int j = 0;j < 3;j++){
                mess[i][j] = sc.nextInt();
            }
        }
        int[] teams = new int[n + 1];
        for(int i = 0;i < n + 1;i++){
            teams[i] = i;
        }
        for(int i = 0;i < m;i++){
            int p1 = mess[i][0],p2 = mess[i][1],cmd = mess[i][2];
            if(p1 < 1 ||  p1 > n || p2 < 1 || p2 > n){
                System.out.println("da pian zi ");
                continue;
            }
            if(cmd == 0){
                int team1 = find(p1,teams);
                int team2 = find(p2,teams);
                if(team1 != team2){
                    teams[p2] = p1;
                }
            }else if(cmd == 1){
                System.out.println(find(p1,teams) == find(p2,teams) ? "We are a team" : "We are not a team");
            }else{
                System.out.println("da pian zi");
            }
        }
    }


    public static int find(int p,int[] teams){
        if(teams[p] != p){
            return teams[p] = find(teams[p],teams);
        }
        return p;
    }
}
