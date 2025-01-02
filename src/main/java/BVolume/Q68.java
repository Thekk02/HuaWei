package BVolume;

import sun.util.BuddhistCalendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 运维日志排序
 * @date 2025-1-2 12:37:32
 */
public class Q68 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] logs = new String[n];
        for(int i = 0;i < n;i++){
            logs[i] = br.readLine();

        }
        Arrays.sort(logs,(a,b) -> Long.compare(convert(a),convert(b)));
        System.out.println(String.join("\n",logs));
    }
    public static long convert(String log){
        String[] tmp = log.split("[:.]");
        long H = Long.parseLong(tmp[0]) * 60 * 60 * 1000;
        long M = Long.parseLong(tmp[1])  * 60 * 1000;
        long S = Long.parseLong(tmp[2]) * 1000;
        long N = Long.parseLong(tmp[3]);
        return H + M + S + N;
    }
}
