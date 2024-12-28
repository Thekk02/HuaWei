package CVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 素数之积
 * @date 2024-12-28 15:05:52
 */
public class Q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = (int)Math.sqrt(n);
        for(int i = 1;i <= mid;i++){
            if(n % i == 0 && isPrime(i) && isPrime(n / i)){
                System.out.println(i + " " + n / i);
                return;
            }
        }
        System.out.println("-1,-1");
    }

    public static boolean isPrime(int n){
        if(n <= 3){
            return true;
        }else{
            for(int i = 3;i < n;i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
